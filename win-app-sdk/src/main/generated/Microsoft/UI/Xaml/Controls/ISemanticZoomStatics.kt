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

@ABIMarker(ISemanticZoomStatics.ABI::class)
@Signature("{e4fbd358-9342-56d3-b5c2-bf80de6f47ed}")
@Guid("e4fbd358934256d3b5c2bf80de6f47ed")
@WinRTInterface("e4fbd358934256d3b5c2bf80de6f47ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISemanticZoomStatics.ByReference::class)
public interface ISemanticZoomStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ZoomedInViewProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ZoomedOutViewProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsZoomedInViewActiveProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_CanChangeViewsProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_IsZoomOutButtonEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISemanticZoomStatics> {
    public override fun getValue() = ABI.makeISemanticZoomStatics(pointer.getPointer(0))

    public fun setValue(value: ISemanticZoomStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISemanticZoomStatics {
    public val __475477595_Ptr: Pointer?

    public val _475477595_VtblPtr: Pointer?
      get() = __475477595_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ZoomedInViewProperty(): DependencyProperty? {
      val fnPtr = _475477595_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__475477595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ZoomedOutViewProperty(): DependencyProperty? {
      val fnPtr = _475477595_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__475477595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsZoomedInViewActiveProperty(): DependencyProperty? {
      val fnPtr = _475477595_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__475477595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CanChangeViewsProperty(): DependencyProperty? {
      val fnPtr = _475477595_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__475477595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsZoomOutButtonEnabledProperty(): DependencyProperty? {
      val fnPtr = _475477595_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__475477595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISemanticZoomStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __475477595_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISemanticZoomStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e4fbd358934256d3b5c2bf80de6f47ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISemanticZoomStatics(ptr: Pointer?): WithDefault = ISemanticZoomStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISemanticZoomStatics {
      val address = segment.toRawLongValue()
      return makeISemanticZoomStatics(Pointer(address))
    }

    public override fun toNative(obj: ISemanticZoomStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__475477595_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISemanticZoomStatics): Array<ISemanticZoomStatics?> =
        (elements as
        Array<ISemanticZoomStatics?>).castToImpl<ISemanticZoomStatics,ISemanticZoomStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISemanticZoomStatics?> =
        arrayOfNulls<ISemanticZoomStatics_Impl>(size) as Array<ISemanticZoomStatics?>
  }
}
