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

@ABIMarker(IAnimatedIcon.ABI::class)
@Signature("{f705dfda-8196-56d0-8dcf-2b66c2aed791}")
@Guid("f705dfda819656d08dcf2b66c2aed791")
@WinRTInterface("f705dfda819656d08dcf2b66c2aed791")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedIcon.ByReference::class)
public interface IAnimatedIcon : NativeMapped, IWinRTInterface {
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAnimatedIcon>
      {
    public override fun getValue() = ABI.makeIAnimatedIcon(pointer.getPointer(0))

    public fun setValue(value: IAnimatedIcon_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedIcon {
    public val __145773565_Ptr: Pointer?

    public val _145773565_VtblPtr: Pointer?
      get() = __145773565_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): IAnimatedVisualSource2? {
      val fnPtr = _145773565_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAnimatedVisualSource2>()
      val hr = fn.invokeHR(arrayOf(__145773565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAnimatedVisualSource2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Source(value: IAnimatedVisualSource2?): Unit {
      val fnPtr = _145773565_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__145773565_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FallbackIconSource(): IconSource? {
      val fnPtr = _145773565_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconSource>()
      val hr = fn.invokeHR(arrayOf(__145773565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_FallbackIconSource(value: IconSource?): Unit {
      val fnPtr = _145773565_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__145773565_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MirroredWhenRightToLeft(): Boolean {
      val fnPtr = _145773565_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__145773565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MirroredWhenRightToLeft(value: Boolean): Unit {
      val fnPtr = _145773565_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__145773565_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAnimatedIcon_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __145773565_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedIcon, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f705dfda819656d08dcf2b66c2aed791")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedIcon(ptr: Pointer?): WithDefault = IAnimatedIcon_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedIcon {
      val address = segment.toRawLongValue()
      return makeIAnimatedIcon(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__145773565_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedIcon): Array<IAnimatedIcon?> = (elements as
        Array<IAnimatedIcon?>).castToImpl<IAnimatedIcon,IAnimatedIcon_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedIcon?> =
        arrayOfNulls<IAnimatedIcon_Impl>(size) as Array<IAnimatedIcon?>
  }
}
