package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFrameStatics.ABI::class)
@Signature("{8a974d00-8da2-588a-a182-1f7621ee650b}")
@Guid("8a974d008da2588aa1821f7621ee650b")
@WinRTInterface("8a974d008da2588aa1821f7621ee650b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameStatics.ByReference::class)
public interface IFrameStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CacheSizeProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CanGoBackProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_CanGoForwardProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_CurrentSourcePageTypeProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_SourcePageTypeProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_BackStackDepthProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_BackStackProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_ForwardStackProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_IsNavigationStackEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFrameStatics>
      {
    public override fun getValue() = ABI.makeIFrameStatics(pointer.getPointer(0))

    public fun setValue(value: IFrameStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameStatics {
    public val __1234680609_Ptr: Pointer?

    public val _1234680609_VtblPtr: Pointer?
      get() = __1234680609_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CacheSizeProperty(): DependencyProperty? {
      val fnPtr = _1234680609_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1234680609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CanGoBackProperty(): DependencyProperty? {
      val fnPtr = _1234680609_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1234680609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CanGoForwardProperty(): DependencyProperty? {
      val fnPtr = _1234680609_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1234680609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CurrentSourcePageTypeProperty(): DependencyProperty? {
      val fnPtr = _1234680609_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1234680609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SourcePageTypeProperty(): DependencyProperty? {
      val fnPtr = _1234680609_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1234680609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_BackStackDepthProperty(): DependencyProperty? {
      val fnPtr = _1234680609_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1234680609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_BackStackProperty(): DependencyProperty? {
      val fnPtr = _1234680609_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1234680609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ForwardStackProperty(): DependencyProperty? {
      val fnPtr = _1234680609_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1234680609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_IsNavigationStackEnabledProperty(): DependencyProperty? {
      val fnPtr = _1234680609_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1234680609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFrameStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1234680609_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8a974d008da2588aa1821f7621ee650b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameStatics(ptr: Pointer?): WithDefault = IFrameStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameStatics {
      val address = segment.toRawLongValue()
      return makeIFrameStatics(Pointer(address))
    }

    public override fun toNative(obj: IFrameStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1234680609_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameStatics): Array<IFrameStatics?> = (elements as
        Array<IFrameStatics?>).castToImpl<IFrameStatics,IFrameStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameStatics?> =
        arrayOfNulls<IFrameStatics_Impl>(size) as Array<IFrameStatics?>
  }
}
