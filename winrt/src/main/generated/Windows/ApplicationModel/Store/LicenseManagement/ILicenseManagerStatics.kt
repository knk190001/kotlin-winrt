package Windows.ApplicationModel.Store.LicenseManagement

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILicenseManagerStatics.ABI::class)
@Signature("{b5ac3ae0-da47-4f20-9a23-09182c9476ff}")
@Guid("b5ac3ae0da474f209a2309182c9476ff")
@WinRTInterface("b5ac3ae0da474f209a2309182c9476ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILicenseManagerStatics.ByReference::class)
public interface ILicenseManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddLicenseAsync(license: IBuffer?): IAsyncAction?

  @InterfaceMethod(1)
  public fun GetSatisfactionInfosAsync(contentIds: IIterable<String?>?,
      keyIds: IIterable<String?>?): IAsyncOperation<LicenseSatisfactionResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILicenseManagerStatics> {
    public override fun getValue() = ABI.makeILicenseManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ILicenseManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILicenseManagerStatics {
    public val __972094685_Ptr: Pointer?

    public val _972094685_VtblPtr: Pointer?
      get() = __972094685_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddLicenseAsync(license: IBuffer?): IAsyncAction? {
      val fnPtr = _972094685_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__972094685_Ptr, marshalToNative(license), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetSatisfactionInfosAsync(contentIds: IIterable<String?>?,
        keyIds: IIterable<String?>?): IAsyncOperation<LicenseSatisfactionResult?>? {
      val fnPtr = _972094685_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LicenseSatisfactionResult?>>()
      val hr = fn.invokeHR(arrayOf(__972094685_Ptr, marshalToNative(contentIds),
          marshalToNative(keyIds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LicenseSatisfactionResult?>>(result.getValue())
      return resultValue
    }
  }

  public class ILicenseManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __972094685_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILicenseManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b5ac3ae0da474f209a2309182c9476ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILicenseManagerStatics(ptr: Pointer?): WithDefault =
        ILicenseManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILicenseManagerStatics {
      val address = segment.toRawLongValue()
      return makeILicenseManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ILicenseManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__972094685_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILicenseManagerStatics): Array<ILicenseManagerStatics?> =
        (elements as
        Array<ILicenseManagerStatics?>).castToImpl<ILicenseManagerStatics,ILicenseManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILicenseManagerStatics?> =
        arrayOfNulls<ILicenseManagerStatics_Impl>(size) as Array<ILicenseManagerStatics?>
  }
}
