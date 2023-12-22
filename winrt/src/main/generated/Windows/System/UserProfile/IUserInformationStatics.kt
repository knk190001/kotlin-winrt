package Windows.System.UserProfile

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
import Windows.Storage.IStorageFile
import Windows.Storage.Streams.IRandomAccessStream
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IUserInformationStatics.ABI::class)
@Signature("{77f3a910-48fa-489c-934e-2ae85ba8f772}")
@Guid("77f3a91048fa489c934e2ae85ba8f772")
@WinRTInterface("77f3a91048fa489c934e2ae85ba8f772")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserInformationStatics.ByReference::class)
public interface IUserInformationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AccountPictureChangeEnabled(): Boolean

  @InterfaceMethod(1)
  public fun get_NameAccessAllowed(): Boolean

  @InterfaceMethod(2)
  public fun GetAccountPicture(kind: AccountPictureKind?): IStorageFile?

  @InterfaceMethod(3)
  public fun SetAccountPictureAsync(image: IStorageFile?):
      IAsyncOperation<SetAccountPictureResult?>?

  @InterfaceMethod(4)
  public fun SetAccountPicturesAsync(
    smallImage: IStorageFile?,
    largeImage: IStorageFile?,
    video: IStorageFile?
  ): IAsyncOperation<SetAccountPictureResult?>?

  @InterfaceMethod(5)
  public fun SetAccountPictureFromStreamAsync(image: IRandomAccessStream?):
      IAsyncOperation<SetAccountPictureResult?>?

  @InterfaceMethod(6)
  public fun SetAccountPicturesFromStreamsAsync(
    smallImage: IRandomAccessStream?,
    largeImage: IRandomAccessStream?,
    video: IRandomAccessStream?
  ): IAsyncOperation<SetAccountPictureResult?>?

  @InterfaceMethod(7)
  public fun add_AccountPictureChanged(changeHandler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_AccountPictureChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun GetDisplayNameAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(10)
  public fun GetFirstNameAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(11)
  public fun GetLastNameAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(12)
  public fun GetPrincipalNameAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(13)
  public fun GetSessionInitiationProtocolUriAsync(): IAsyncOperation<Uri?>?

  @InterfaceMethod(14)
  public fun GetDomainNameAsync(): IAsyncOperation<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserInformationStatics> {
    public override fun getValue() = ABI.makeIUserInformationStatics(pointer.getPointer(0))

    public fun setValue(value: IUserInformationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserInformationStatics {
    public val __1710751485_Ptr: Pointer?

    public val _1710751485_VtblPtr: Pointer?
      get() = __1710751485_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AccountPictureChangeEnabled(): Boolean {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_NameAccessAllowed(): Boolean {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetAccountPicture(kind: AccountPictureKind?): IStorageFile? {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IStorageFile>()
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr, marshalToNative(kind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IStorageFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetAccountPictureAsync(image: IStorageFile?):
        IAsyncOperation<SetAccountPictureResult?>? {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SetAccountPictureResult?>>()
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr, marshalToNative(image), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SetAccountPictureResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetAccountPicturesAsync(
      smallImage: IStorageFile?,
      largeImage: IStorageFile?,
      video: IStorageFile?
    ): IAsyncOperation<SetAccountPictureResult?>? {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SetAccountPictureResult?>>()
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr, marshalToNative(smallImage),
          marshalToNative(largeImage), marshalToNative(video), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SetAccountPictureResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetAccountPictureFromStreamAsync(image: IRandomAccessStream?):
        IAsyncOperation<SetAccountPictureResult?>? {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SetAccountPictureResult?>>()
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr, marshalToNative(image), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SetAccountPictureResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun SetAccountPicturesFromStreamsAsync(
      smallImage: IRandomAccessStream?,
      largeImage: IRandomAccessStream?,
      video: IRandomAccessStream?
    ): IAsyncOperation<SetAccountPictureResult?>? {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SetAccountPictureResult?>>()
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr, marshalToNative(smallImage),
          marshalToNative(largeImage), marshalToNative(video), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SetAccountPictureResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun add_AccountPictureChanged(changeHandler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr, marshalToNative(changeHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_AccountPictureChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun GetDisplayNameAsync(): IAsyncOperation<String?>? {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetFirstNameAsync(): IAsyncOperation<String?>? {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun GetLastNameAsync(): IAsyncOperation<String?>? {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetPrincipalNameAsync(): IAsyncOperation<String?>? {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetSessionInitiationProtocolUriAsync(): IAsyncOperation<Uri?>? {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun GetDomainNameAsync(): IAsyncOperation<String?>? {
      val fnPtr = _1710751485_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1710751485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IUserInformationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1710751485_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserInformationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("77f3a91048fa489c934e2ae85ba8f772")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserInformationStatics(ptr: Pointer?): WithDefault =
        IUserInformationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserInformationStatics {
      val address = segment.toRawLongValue()
      return makeIUserInformationStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserInformationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1710751485_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserInformationStatics): Array<IUserInformationStatics?>
        = (elements as
        Array<IUserInformationStatics?>).castToImpl<IUserInformationStatics,IUserInformationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserInformationStatics?> =
        arrayOfNulls<IUserInformationStatics_Impl>(size) as Array<IUserInformationStatics?>
  }
}
