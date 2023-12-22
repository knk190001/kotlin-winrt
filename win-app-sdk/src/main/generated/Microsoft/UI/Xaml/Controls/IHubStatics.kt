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

@ABIMarker(IHubStatics.ABI::class)
@Signature("{2834e932-abf1-5e07-aeae-633b726b78cb}")
@Guid("2834e932abf15e07aeae633b726b78cb")
@WinRTInterface("2834e932abf15e07aeae633b726b78cb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHubStatics.ByReference::class)
public interface IHubStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeaderProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_HeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_OrientationProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_DefaultSectionIndexProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_SemanticZoomOwnerProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_IsActiveViewProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_IsZoomedInViewProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHubStatics> {
    public override fun getValue() = ABI.makeIHubStatics(pointer.getPointer(0))

    public fun setValue(value: IHubStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHubStatics {
    public val __2098792937_Ptr: Pointer?

    public val _2098792937_VtblPtr: Pointer?
      get() = __2098792937_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeaderProperty(): DependencyProperty? {
      val fnPtr = _2098792937_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2098792937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _2098792937_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2098792937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_OrientationProperty(): DependencyProperty? {
      val fnPtr = _2098792937_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2098792937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DefaultSectionIndexProperty(): DependencyProperty? {
      val fnPtr = _2098792937_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2098792937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SemanticZoomOwnerProperty(): DependencyProperty? {
      val fnPtr = _2098792937_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2098792937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsActiveViewProperty(): DependencyProperty? {
      val fnPtr = _2098792937_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2098792937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsZoomedInViewProperty(): DependencyProperty? {
      val fnPtr = _2098792937_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2098792937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IHubStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2098792937_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHubStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2834e932abf15e07aeae633b726b78cb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHubStatics(ptr: Pointer?): WithDefault = IHubStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHubStatics {
      val address = segment.toRawLongValue()
      return makeIHubStatics(Pointer(address))
    }

    public override fun toNative(obj: IHubStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2098792937_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHubStatics): Array<IHubStatics?> = (elements as
        Array<IHubStatics?>).castToImpl<IHubStatics,IHubStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHubStatics?> =
        arrayOfNulls<IHubStatics_Impl>(size) as Array<IHubStatics?>
  }
}
