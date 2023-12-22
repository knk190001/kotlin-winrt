package Microsoft.UI.Xaml.Documents

import Microsoft.UI.Xaml.LineStackingStrategy
import Microsoft.UI.Xaml.TextAlignment
import Microsoft.UI.Xaml.Thickness
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBlock.ABI::class)
@Signature("{8149d507-672f-5fd5-a10a-351389ba9659}")
@Guid("8149d507672f5fd5a10a351389ba9659")
@WinRTInterface("8149d507672f5fd5a10a351389ba9659")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBlock.ByReference::class)
public interface IBlock : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextAlignment(): TextAlignment?

  @InterfaceMethod(1)
  public fun put_TextAlignment(value: TextAlignment?): Unit

  @InterfaceMethod(2)
  public fun get_HorizontalTextAlignment(): TextAlignment?

  @InterfaceMethod(3)
  public fun put_HorizontalTextAlignment(value: TextAlignment?): Unit

  @InterfaceMethod(4)
  public fun get_LineHeight(): Double

  @InterfaceMethod(5)
  public fun put_LineHeight(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_LineStackingStrategy(): LineStackingStrategy?

  @InterfaceMethod(7)
  public fun put_LineStackingStrategy(value: LineStackingStrategy?): Unit

  @InterfaceMethod(8)
  public fun get_Margin(): Thickness?

  @InterfaceMethod(9)
  public fun put_Margin(value: Thickness?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBlock> {
    public override fun getValue() = ABI.makeIBlock(pointer.getPointer(0))

    public fun setValue(value: IBlock_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBlock {
    public val __1715039440_Ptr: Pointer?

    public val _1715039440_VtblPtr: Pointer?
      get() = __1715039440_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextAlignment(): TextAlignment? {
      val fnPtr = _1715039440_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextAlignment>()
      val hr = fn.invokeHR(arrayOf(__1715039440_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TextAlignment(value: TextAlignment?): Unit {
      val fnPtr = _1715039440_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1715039440_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HorizontalTextAlignment(): TextAlignment? {
      val fnPtr = _1715039440_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextAlignment>()
      val hr = fn.invokeHR(arrayOf(__1715039440_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_HorizontalTextAlignment(value: TextAlignment?): Unit {
      val fnPtr = _1715039440_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1715039440_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_LineHeight(): Double {
      val fnPtr = _1715039440_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1715039440_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_LineHeight(value: Double): Unit {
      val fnPtr = _1715039440_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1715039440_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_LineStackingStrategy(): LineStackingStrategy? {
      val fnPtr = _1715039440_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineStackingStrategy>()
      val hr = fn.invokeHR(arrayOf(__1715039440_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineStackingStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_LineStackingStrategy(value: LineStackingStrategy?): Unit {
      val fnPtr = _1715039440_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1715039440_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Margin(): Thickness? {
      val fnPtr = _1715039440_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1715039440_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Margin(value: Thickness?): Unit {
      val fnPtr = _1715039440_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1715039440_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBlock_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1715039440_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBlock, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8149d507672f5fd5a10a351389ba9659")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBlock(ptr: Pointer?): WithDefault = IBlock_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBlock {
      val address = segment.toRawLongValue()
      return makeIBlock(Pointer(address))
    }

    public override fun toNative(obj: IBlock): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1715039440_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBlock): Array<IBlock?> = (elements as
        Array<IBlock?>).castToImpl<IBlock,IBlock_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBlock?> = arrayOfNulls<IBlock_Impl>(size) as
        Array<IBlock?>
  }
}
