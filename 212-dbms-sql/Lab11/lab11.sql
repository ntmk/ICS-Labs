--q1 a)

column prod_category format a20;
column fiscal_year format a10;
column promo_name format a20;

select prod.prod_category, tm.fiscal_year, prom.promo_category, to_char(sum(amount_sold), 
'$9,999,999,999') as sales

from sh.products prod, sh.times tm, sh.promotions prom, sh.sales sale

where sale.prod_id = prod.prod_id
and sale.promo_id = prom.promo_id
and sale.time_id = tm.time_id
and prom.promo_category in ('TV','internet')
and tm.fiscal_year in (2000, 2001)
group by rollup (prod.prod_category, tm.fiscal_year, prom.promo_category)
order by prod.prod_category;

--q1 b)

column prod_category format a20;
column fiscal_year format a10;
column promo_name format a20;

select prod.prod_category, tm.fiscal_year, prom.promo_category, to_char(sum(amount_sold), 
'$9,999,999,999') as sales

from sh.products prod, sh.times tm, sh.promotions prom, sh.sales sale

where sale.prod_id = prod.prod_id
and sale.promo_id = prom.promo_id
and sale.time_id = tm.time_id
and prom.promo_category in ('TV','internet')
and tm.fiscal_year in (2000, 2001)
and prod.prod_category in ('Electronics', 'Hardware')
group by cube (prod.prod_category, tm.fiscal_year, prom.promo_category)
order by prod.prod_category;

--q1 c) NOT COMPLETE

column prod_category format a20;
column fiscal_year format a10;
column promo_name format a20;

select prod.prod_category, tm.fiscal_year, prom.promo_category, to_char(sum(amount_sold), 
'$9,999,999,999') as sales

from sh.products prod, sh.times tm, sh.promotions prom, sh.sales sale, sh.channels chnls

where sale.prod_id = prod.prod_id
and sale.promo_id = prom.promo_id
and sale.time_id = tm.time_id
and sale.channel_id = chnls.channel_id
and prom.promo_category in ('TV','internet')
and tm.fiscal_year in (2000, 2001)
and prod.prod_category in ('Electronics', 'Hardware')
group by grouping sets ((prod.prod_category, tm.fiscal_year), (tm.fiscal_year, prom.promo_category), ())
order by prod.prod_category;

--q2 

column prod_category format a20;
column fiscal_year format a10;
column promo_name format a20;

select * from 
(select prod.prod_category, prod.prod_name, to_char(sum(amount_sold), 
'$9,999,999,999') as sales, rank() over (partition by prod.prod_category 
order by sum(amount_sold) desc) as Rank

from sh.products prod, sh.times tm, sh.promotions prom, sh.sales sale, 
sh.channels chnls

where sale.prod_id = prod.prod_id
and sale.promo_id = prom.promo_id
and sale.time_id = tm.time_id
and sale.channel_id = chnls.channel_id
and tm.fiscal_year in (2001)
group by prod.prod_category, prod.prod_name)
where rank <= 3;

--q2b)

column prod_category format a20;
column fiscal_year format a10;
column promo_name format a20;

select * from 
(select prod.prod_category, prod.prod_name, to_char(sum(amount_sold), 
'$9,999,999,999') as sales, rank() over (partition by prod.prod_category 
order by sum(amount_sold) asc) as Rank

from sh.products prod, sh.times tm, sh.promotions prom, sh.sales sale, 
sh.channels chnls

where sale.prod_id = prod.prod_id
and sale.promo_id = prom.promo_id
and sale.time_id = tm.time_id
and sale.channel_id = chnls.channel_id
and tm.fiscal_year in (2001)
group by prod.prod_category, prod.prod_name)
where rank <= 3;
