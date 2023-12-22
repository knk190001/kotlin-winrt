package Windows.Networking.BackgroundTransfer

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Uri
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IResponseInformation.ABI::class)
@Signature("{f8bb9a12-f713-4792-8b68-d9d297f91d2e}")
@Guid("f8bb9a12f71347928b68d9d297f91d2e")
@WinRTInterface("f8bb9a12f71347928b68d9d297f91d2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResponseInformation.ByReference::class)
public interface IResponseInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsResumable(): Boolean

  @InterfaceMethod(1)
  public fun get_ActualUri(): Uri?

  @InterfaceMethod(2)
  public fun get_StatusCode(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_Headers(): IMapView<String?, String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResponseInformation> {
    public override fun getValue() = ABI.makeIResponseInformation(pointer.getPointer(0))

    public fun setValue(value: IResponseInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResponseInformation {
    public val __92445002_Ptr: Pointer?

    public val _92445002_VtblPtr: Pointer?
      get() = __92445002_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsResumable(): Boolean {
      val fnPtr = _92445002_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__92445002_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ActualUri(): Uri? {
      val fnPtr = _92445002_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__92445002_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_StatusCode(): WinDef.UINT {
      val fnPtr = _92445002_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__92445002_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Headers(): IMapView<String?, String?>? {
      val fnPtr = _92445002_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__92445002_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, String?>>(result.getValue())
      return resultValue
    }
  }

  public class IResponseInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __92445002_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResponseInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f8bb9a12f71347928b68d9d297f91d2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResponseInformation(ptr: Pointer?): WithDefault = IResponseInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResponseInformation {
      val address = segment.toRawLongValue()
      return makeIResponseInformation(Pointer(address))
    }

    public override fun toNative(obj: IResponseInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__92445002_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResponseInformation): Array<IResponseInformation?> =
        (elements as
        Array<IResponseInformation?>).castToImpl<IResponseInformation,IResponseInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResponseInformation?> =
        arrayOfNulls<IResponseInformation_Impl>(size) as Array<IResponseInformation?>
  }
}
