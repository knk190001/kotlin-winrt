package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
import Microsoft.UI.Xaml.UIElement
import Windows.Foundation.IReference
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

@ABIMarker(IMediaTransportControlsHelperStatics.ABI::class)
@Signature("{f1bf86f5-bc62-5722-bebd-a00102d857d3}")
@Guid("f1bf86f5bc625722bebda00102d857d3")
@WinRTInterface("f1bf86f5bc625722bebda00102d857d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTransportControlsHelperStatics.ByReference::class)
public interface IMediaTransportControlsHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DropoutOrderProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetDropoutOrder(element: UIElement?): IReference<Int>?

  @InterfaceMethod(2)
  public fun SetDropoutOrder(element: UIElement?, value: IReference<Int>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTransportControlsHelperStatics> {
    public override fun getValue() =
        ABI.makeIMediaTransportControlsHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IMediaTransportControlsHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTransportControlsHelperStatics {
    public val __866959189_Ptr: Pointer?

    public val _866959189_VtblPtr: Pointer?
      get() = __866959189_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DropoutOrderProperty(): DependencyProperty? {
      val fnPtr = _866959189_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__866959189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDropoutOrder(element: UIElement?): IReference<Int>? {
      val fnPtr = _866959189_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__866959189_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetDropoutOrder(element: UIElement?, value: IReference<Int>?): Unit {
      val fnPtr = _866959189_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__866959189_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaTransportControlsHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __866959189_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTransportControlsHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f1bf86f5bc625722bebda00102d857d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTransportControlsHelperStatics(ptr: Pointer?): WithDefault =
        IMediaTransportControlsHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaTransportControlsHelperStatics {
      val address = segment.toRawLongValue()
      return makeIMediaTransportControlsHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IMediaTransportControlsHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__866959189_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTransportControlsHelperStatics):
        Array<IMediaTransportControlsHelperStatics?> = (elements as
        Array<IMediaTransportControlsHelperStatics?>).castToImpl<IMediaTransportControlsHelperStatics,IMediaTransportControlsHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTransportControlsHelperStatics?> =
        arrayOfNulls<IMediaTransportControlsHelperStatics_Impl>(size) as
        Array<IMediaTransportControlsHelperStatics?>
  }
}
