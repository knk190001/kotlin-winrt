package Windows.ApplicationModel.SocialInfo.Provider

import Windows.ApplicationModel.SocialInfo.SocialFeedKind
import Windows.ApplicationModel.SocialInfo.SocialFeedUpdateMode
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISocialInfoProviderManagerStatics.ABI::class)
@Signature("{1b88e52b-7787-48d6-aa12-d8e8f47ab85a}")
@Guid("1b88e52b778748d6aa12d8e8f47ab85a")
@WinRTInterface("1b88e52b778748d6aa12d8e8f47ab85a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISocialInfoProviderManagerStatics.ByReference::class)
public interface ISocialInfoProviderManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateSocialFeedUpdaterAsync(
    kind: SocialFeedKind?,
    mode: SocialFeedUpdateMode?,
    ownerRemoteId: String?
  ): IAsyncOperation<SocialFeedUpdater?>?

  @InterfaceMethod(1)
  public fun CreateDashboardItemUpdaterAsync(ownerRemoteId: String?):
      IAsyncOperation<SocialDashboardItemUpdater?>?

  @InterfaceMethod(2)
  public fun UpdateBadgeCountValue(itemRemoteId: String?, newCount: Int): Unit

  @InterfaceMethod(3)
  public fun ReportNewContentAvailable(contactRemoteId: String?, kind: SocialFeedKind?): Unit

  @InterfaceMethod(4)
  public fun ProvisionAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(5)
  public fun DeprovisionAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISocialInfoProviderManagerStatics> {
    public override fun getValue() =
        ABI.makeISocialInfoProviderManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ISocialInfoProviderManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISocialInfoProviderManagerStatics {
    public val __1527291667_Ptr: Pointer?

    public val _1527291667_VtblPtr: Pointer?
      get() = __1527291667_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateSocialFeedUpdaterAsync(
      kind: SocialFeedKind?,
      mode: SocialFeedUpdateMode?,
      ownerRemoteId: String?
    ): IAsyncOperation<SocialFeedUpdater?>? {
      val fnPtr = _1527291667_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SocialFeedUpdater?>>()
      val hr = fn.invokeHR(arrayOf(__1527291667_Ptr, marshalToNative(kind), marshalToNative(mode),
          marshalToNative(ownerRemoteId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SocialFeedUpdater?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateDashboardItemUpdaterAsync(ownerRemoteId: String?):
        IAsyncOperation<SocialDashboardItemUpdater?>? {
      val fnPtr = _1527291667_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SocialDashboardItemUpdater?>>()
      val hr = fn.invokeHR(arrayOf(__1527291667_Ptr, marshalToNative(ownerRemoteId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SocialDashboardItemUpdater?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun UpdateBadgeCountValue(itemRemoteId: String?, newCount: Int): Unit {
      val fnPtr = _1527291667_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1527291667_Ptr, marshalToNative(itemRemoteId), newCount,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun ReportNewContentAvailable(contactRemoteId: String?, kind: SocialFeedKind?):
        Unit {
      val fnPtr = _1527291667_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1527291667_Ptr, marshalToNative(contactRemoteId),
          marshalToNative(kind),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun ProvisionAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1527291667_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1527291667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun DeprovisionAsync(): IAsyncAction? {
      val fnPtr = _1527291667_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1527291667_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ISocialInfoProviderManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1527291667_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISocialInfoProviderManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b88e52b778748d6aa12d8e8f47ab85a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISocialInfoProviderManagerStatics(ptr: Pointer?): WithDefault =
        ISocialInfoProviderManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISocialInfoProviderManagerStatics {
      val address = segment.toRawLongValue()
      return makeISocialInfoProviderManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ISocialInfoProviderManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1527291667_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISocialInfoProviderManagerStatics):
        Array<ISocialInfoProviderManagerStatics?> = (elements as
        Array<ISocialInfoProviderManagerStatics?>).castToImpl<ISocialInfoProviderManagerStatics,ISocialInfoProviderManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISocialInfoProviderManagerStatics?> =
        arrayOfNulls<ISocialInfoProviderManagerStatics_Impl>(size) as
        Array<ISocialInfoProviderManagerStatics?>
  }
}
