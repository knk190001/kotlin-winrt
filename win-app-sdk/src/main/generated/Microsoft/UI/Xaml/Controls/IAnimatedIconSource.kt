package Microsoft.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAnimatedIconSource.ABI::class)
@Signature("{2846a198-731b-5379-85ac-8f28027f7183}")
@Guid("2846a198731b537985ac8f28027f7183")
@WinRTInterface("2846a198731b537985ac8f28027f7183")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedIconSource.ByReference::class)
public interface IAnimatedIconSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): IAnimatedVisualSource2?

  @InterfaceMethod(1)
  public fun put_Source(value: IAnimatedVisualSource2?): Unit

  @InterfaceMethod(2)
  public fun get_FallbackIconSource(): IconSource?

  @InterfaceMethod(3)
  public fun put_FallbackIconSource(value: IconSource?): Unit

  @InterfaceMethod(4)
  public fun get_MirroredWhenRightToLeft(): Boolean

  @InterfaceMethod(5)
  public fun put_MirroredWhenRightToLeft(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedIconSource> {
    public override fun getValue() = ABI.makeIAnimatedIconSource(pointer.getPointer(0))

    public fun setValue(value: IAnimatedIconSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedIconSource {
    public val __494489090_Ptr: Pointer?

    public val _494489090_VtblPtr: Pointer?
      get() = __494489090_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): IAnimatedVisualSource2? {
      val fnPtr = _494489090_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAnimatedVisualSource2>()
      val hr = fn.invokeHR(arrayOf(__494489090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAnimatedVisualSource2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Source(value: IAnimatedVisualSource2?): Unit {
      val fnPtr = _494489090_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__494489090_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FallbackIconSource(): IconSource? {
      val fnPtr = _494489090_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconSource>()
      val hr = fn.invokeHR(arrayOf(__494489090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_FallbackIconSource(value: IconSource?): Unit {
      val fnPtr = _494489090_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__494489090_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MirroredWhenRightToLeft(): Boolean {
      val fnPtr = _494489090_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__494489090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MirroredWhenRightToLeft(value: Boolean): Unit {
      val fnPtr = _494489090_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__494489090_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAnimatedIconSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __494489090_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedIconSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2846a198731b537985ac8f28027f7183")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedIconSource(ptr: Pointer?): WithDefault = IAnimatedIconSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedIconSource {
      val address = segment.toRawLongValue()
      return makeIAnimatedIconSource(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedIconSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__494489090_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedIconSource): Array<IAnimatedIconSource?> =
        (elements as
        Array<IAnimatedIconSource?>).castToImpl<IAnimatedIconSource,IAnimatedIconSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedIconSource?> =
        arrayOfNulls<IAnimatedIconSource_Impl>(size) as Array<IAnimatedIconSource?>
  }
}
