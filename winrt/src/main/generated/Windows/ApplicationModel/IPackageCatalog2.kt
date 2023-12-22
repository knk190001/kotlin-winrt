package Windows.ApplicationModel

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IPackageCatalog2.ABI::class)
@Signature("{96a60c36-8ff7-4344-b6bf-ee64c2207ed2}")
@Guid("96a60c368ff74344b6bfee64c2207ed2")
@WinRTInterface("96a60c368ff74344b6bfee64c2207ed2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageCatalog2.ByReference::class)
public interface IPackageCatalog2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_PackageContentGroupStaging(handler: TypedEventHandler<PackageCatalog?,
      PackageContentGroupStagingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_PackageContentGroupStaging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun AddOptionalPackageAsync(optionalPackageFamilyName: String?):
      IAsyncOperation<PackageCatalogAddOptionalPackageResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageCatalog2> {
    public override fun getValue() = ABI.makeIPackageCatalog2(pointer.getPointer(0))

    public fun setValue(value: IPackageCatalog2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageCatalog2 {
    public val __184253926_Ptr: Pointer?

    public val _184253926_VtblPtr: Pointer?
      get() = __184253926_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_PackageContentGroupStaging(handler: TypedEventHandler<PackageCatalog?,
        PackageContentGroupStagingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _184253926_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__184253926_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_PackageContentGroupStaging(token: EventRegistrationToken?): Unit {
      val fnPtr = _184253926_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__184253926_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun AddOptionalPackageAsync(optionalPackageFamilyName: String?):
        IAsyncOperation<PackageCatalogAddOptionalPackageResult?>? {
      val fnPtr = _184253926_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PackageCatalogAddOptionalPackageResult?>>()
      val hr = fn.invokeHR(arrayOf(__184253926_Ptr, marshalToNative(optionalPackageFamilyName),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PackageCatalogAddOptionalPackageResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IPackageCatalog2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __184253926_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageCatalog2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96a60c368ff74344b6bfee64c2207ed2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageCatalog2(ptr: Pointer?): WithDefault = IPackageCatalog2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageCatalog2 {
      val address = segment.toRawLongValue()
      return makeIPackageCatalog2(Pointer(address))
    }

    public override fun toNative(obj: IPackageCatalog2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__184253926_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageCatalog2): Array<IPackageCatalog2?> = (elements as
        Array<IPackageCatalog2?>).castToImpl<IPackageCatalog2,IPackageCatalog2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageCatalog2?> =
        arrayOfNulls<IPackageCatalog2_Impl>(size) as Array<IPackageCatalog2?>
  }
}
