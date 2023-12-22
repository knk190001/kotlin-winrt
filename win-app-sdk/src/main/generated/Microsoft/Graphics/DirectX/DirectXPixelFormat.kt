package Microsoft.Graphics.DirectX

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(DirectXPixelFormat.ABI::class)
@Signature("enum(Microsoft.Graphics.DirectX.DirectXPixelFormat;i4)")
@WinRTByReference(brClass = DirectXPixelFormat.ByReference::class)
public enum class DirectXPixelFormat(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  R32G32B32A32Typeless(1),
  R32G32B32A32Float(2),
  R32G32B32A32UInt(3),
  R32G32B32A32Int(4),
  R32G32B32Typeless(5),
  R32G32B32Float(6),
  R32G32B32UInt(7),
  R32G32B32Int(8),
  R16G16B16A16Typeless(9),
  R16G16B16A16Float(10),
  R16G16B16A16UIntNormalized(11),
  R16G16B16A16UInt(12),
  R16G16B16A16IntNormalized(13),
  R16G16B16A16Int(14),
  R32G32Typeless(15),
  R32G32Float(16),
  R32G32UInt(17),
  R32G32Int(18),
  R32G8X24Typeless(19),
  D32FloatS8X24UInt(20),
  R32FloatX8X24Typeless(21),
  X32TypelessG8X24UInt(22),
  R10G10B10A2Typeless(23),
  R10G10B10A2UIntNormalized(24),
  R10G10B10A2UInt(25),
  R11G11B10Float(26),
  R8G8B8A8Typeless(27),
  R8G8B8A8UIntNormalized(28),
  R8G8B8A8UIntNormalizedSrgb(29),
  R8G8B8A8UInt(30),
  R8G8B8A8IntNormalized(31),
  R8G8B8A8Int(32),
  R16G16Typeless(33),
  R16G16Float(34),
  R16G16UIntNormalized(35),
  R16G16UInt(36),
  R16G16IntNormalized(37),
  R16G16Int(38),
  R32Typeless(39),
  D32Float(40),
  R32Float(41),
  R32UInt(42),
  R32Int(43),
  R24G8Typeless(44),
  D24UIntNormalizedS8UInt(45),
  R24UIntNormalizedX8Typeless(46),
  X24TypelessG8UInt(47),
  R8G8Typeless(48),
  R8G8UIntNormalized(49),
  R8G8UInt(50),
  R8G8IntNormalized(51),
  R8G8Int(52),
  R16Typeless(53),
  R16Float(54),
  D16UIntNormalized(55),
  R16UIntNormalized(56),
  R16UInt(57),
  R16IntNormalized(58),
  R16Int(59),
  R8Typeless(60),
  R8UIntNormalized(61),
  R8UInt(62),
  R8IntNormalized(63),
  R8Int(64),
  A8UIntNormalized(65),
  R1UIntNormalized(66),
  R9G9B9E5SharedExponent(67),
  R8G8B8G8UIntNormalized(68),
  G8R8G8B8UIntNormalized(69),
  BC1Typeless(70),
  BC1UIntNormalized(71),
  BC1UIntNormalizedSrgb(72),
  BC2Typeless(73),
  BC2UIntNormalized(74),
  BC2UIntNormalizedSrgb(75),
  BC3Typeless(76),
  BC3UIntNormalized(77),
  BC3UIntNormalizedSrgb(78),
  BC4Typeless(79),
  BC4UIntNormalized(80),
  BC4IntNormalized(81),
  BC5Typeless(82),
  BC5UIntNormalized(83),
  BC5IntNormalized(84),
  B5G6R5UIntNormalized(85),
  B5G5R5A1UIntNormalized(86),
  B8G8R8A8UIntNormalized(87),
  B8G8R8X8UIntNormalized(88),
  R10G10B10XRBiasA2UIntNormalized(89),
  B8G8R8A8Typeless(90),
  B8G8R8A8UIntNormalizedSrgb(91),
  B8G8R8X8Typeless(92),
  B8G8R8X8UIntNormalizedSrgb(93),
  BC6HTypeless(94),
  BC6H16UnsignedFloat(95),
  BC6H16Float(96),
  BC7Typeless(97),
  BC7UIntNormalized(98),
  BC7UIntNormalizedSrgb(99),
  Ayuv(100),
  Y410(101),
  Y416(102),
  NV12(103),
  P010(104),
  P016(105),
  Opaque420(106),
  Yuy2(107),
  Y210(108),
  Y216(109),
  NV11(110),
  AI44(111),
  IA44(112),
  P8(113),
  A8P8(114),
  B4G4R4A4UIntNormalized(115),
  P208(130),
  V208(131),
  V408(132),
  SamplerFeedbackMinMipOpaque(189),
  SamplerFeedbackMipRegionUsedOpaque(190),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DirectXPixelFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> R32G32B32A32Typeless
      2 -> R32G32B32A32Float
      3 -> R32G32B32A32UInt
      4 -> R32G32B32A32Int
      5 -> R32G32B32Typeless
      6 -> R32G32B32Float
      7 -> R32G32B32UInt
      8 -> R32G32B32Int
      9 -> R16G16B16A16Typeless
      10 -> R16G16B16A16Float
      11 -> R16G16B16A16UIntNormalized
      12 -> R16G16B16A16UInt
      13 -> R16G16B16A16IntNormalized
      14 -> R16G16B16A16Int
      15 -> R32G32Typeless
      16 -> R32G32Float
      17 -> R32G32UInt
      18 -> R32G32Int
      19 -> R32G8X24Typeless
      20 -> D32FloatS8X24UInt
      21 -> R32FloatX8X24Typeless
      22 -> X32TypelessG8X24UInt
      23 -> R10G10B10A2Typeless
      24 -> R10G10B10A2UIntNormalized
      25 -> R10G10B10A2UInt
      26 -> R11G11B10Float
      27 -> R8G8B8A8Typeless
      28 -> R8G8B8A8UIntNormalized
      29 -> R8G8B8A8UIntNormalizedSrgb
      30 -> R8G8B8A8UInt
      31 -> R8G8B8A8IntNormalized
      32 -> R8G8B8A8Int
      33 -> R16G16Typeless
      34 -> R16G16Float
      35 -> R16G16UIntNormalized
      36 -> R16G16UInt
      37 -> R16G16IntNormalized
      38 -> R16G16Int
      39 -> R32Typeless
      40 -> D32Float
      41 -> R32Float
      42 -> R32UInt
      43 -> R32Int
      44 -> R24G8Typeless
      45 -> D24UIntNormalizedS8UInt
      46 -> R24UIntNormalizedX8Typeless
      47 -> X24TypelessG8UInt
      48 -> R8G8Typeless
      49 -> R8G8UIntNormalized
      50 -> R8G8UInt
      51 -> R8G8IntNormalized
      52 -> R8G8Int
      53 -> R16Typeless
      54 -> R16Float
      55 -> D16UIntNormalized
      56 -> R16UIntNormalized
      57 -> R16UInt
      58 -> R16IntNormalized
      59 -> R16Int
      60 -> R8Typeless
      61 -> R8UIntNormalized
      62 -> R8UInt
      63 -> R8IntNormalized
      64 -> R8Int
      65 -> A8UIntNormalized
      66 -> R1UIntNormalized
      67 -> R9G9B9E5SharedExponent
      68 -> R8G8B8G8UIntNormalized
      69 -> G8R8G8B8UIntNormalized
      70 -> BC1Typeless
      71 -> BC1UIntNormalized
      72 -> BC1UIntNormalizedSrgb
      73 -> BC2Typeless
      74 -> BC2UIntNormalized
      75 -> BC2UIntNormalizedSrgb
      76 -> BC3Typeless
      77 -> BC3UIntNormalized
      78 -> BC3UIntNormalizedSrgb
      79 -> BC4Typeless
      80 -> BC4UIntNormalized
      81 -> BC4IntNormalized
      82 -> BC5Typeless
      83 -> BC5UIntNormalized
      84 -> BC5IntNormalized
      85 -> B5G6R5UIntNormalized
      86 -> B5G5R5A1UIntNormalized
      87 -> B8G8R8A8UIntNormalized
      88 -> B8G8R8X8UIntNormalized
      89 -> R10G10B10XRBiasA2UIntNormalized
      90 -> B8G8R8A8Typeless
      91 -> B8G8R8A8UIntNormalizedSrgb
      92 -> B8G8R8X8Typeless
      93 -> B8G8R8X8UIntNormalizedSrgb
      94 -> BC6HTypeless
      95 -> BC6H16UnsignedFloat
      96 -> BC6H16Float
      97 -> BC7Typeless
      98 -> BC7UIntNormalized
      99 -> BC7UIntNormalizedSrgb
      100 -> Ayuv
      101 -> Y410
      102 -> Y416
      103 -> NV12
      104 -> P010
      105 -> P016
      106 -> Opaque420
      107 -> Yuy2
      108 -> Y210
      109 -> Y216
      110 -> NV11
      111 -> AI44
      112 -> IA44
      113 -> P8
      114 -> A8P8
      115 -> B4G4R4A4UIntNormalized
      130 -> P208
      131 -> V208
      132 -> V408
      189 -> SamplerFeedbackMinMipOpaque
      190 -> SamplerFeedbackMipRegionUsedOpaque
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DirectXPixelFormat> {
    public fun setValue(newValue: DirectXPixelFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DirectXPixelFormat =
        DirectXPixelFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DirectXPixelFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DirectXPixelFormat =
        DirectXPixelFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: DirectXPixelFormat): Int = obj.value
  }
}
