package Windows.UI.WindowManagement

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

@ABIMarker(IAppWindowPresenter.ABI::class)
@Signature("{5ae9ed73-e1fd-5317-ad78-5a3ed271bbde}")
@Guid("5ae9ed73e1fd5317ad785a3ed271bbde")
@WinRTInterface("5ae9ed73e1fd5317ad785a3ed271bbde")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowPresenter.ByReference::class)
public interface IAppWindowPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetConfiguration(): AppWindowPresentationConfiguration?

  @InterfaceMethod(1)
  public fun IsPresentationSupported(presentationKind: AppWindowPresentationKind?): Boolean

  @InterfaceMethod(2)
  public fun RequestPresentation(configuration: AppWindowPresentationConfiguration?): Boolean

  @InterfaceMethod(3)
  public fun RequestPresentation(presentationKind: AppWindowPresentationKind?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowPresenter> {
    public override fun getValue() = ABI.makeIAppWindowPresenter(pointer.getPointer(0))

    public fun setValue(value: IAppWindowPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowPresenter {
    public val __1223473310_Ptr: Pointer?

    public val _1223473310_VtblPtr: Pointer?
      get() = __1223473310_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetConfiguration(): AppWindowPresentationConfiguration? {
      val fnPtr = _1223473310_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppWindowPresentationConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1223473310_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppWindowPresentationConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun IsPresentationSupported(presentationKind: AppWindowPresentationKind?):
        Boolean {
      val fnPtr = _1223473310_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1223473310_Ptr, marshalToNative(presentationKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun RequestPresentation(configuration: AppWindowPresentationConfiguration?):
        Boolean {
      val fnPtr = _1223473310_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1223473310_Ptr, marshalToNative(configuration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun RequestPresentation(presentationKind: AppWindowPresentationKind?): Boolean {
      val fnPtr = _1223473310_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1223473310_Ptr, marshalToNative(presentationKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppWindowPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1223473310_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ae9ed73e1fd5317ad785a3ed271bbde")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowPresenter(ptr: Pointer?): WithDefault = IAppWindowPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowPresenter {
      val address = segment.toRawLongValue()
      return makeIAppWindowPresenter(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1223473310_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowPresenter): Array<IAppWindowPresenter?> =
        (elements as
        Array<IAppWindowPresenter?>).castToImpl<IAppWindowPresenter,IAppWindowPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowPresenter?> =
        arrayOfNulls<IAppWindowPresenter_Impl>(size) as Array<IAppWindowPresenter?>
  }
}
