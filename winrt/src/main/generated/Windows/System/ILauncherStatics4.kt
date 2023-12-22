package Windows.System

import Windows.ApplicationModel.AppInfo
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ILauncherStatics4.ABI::class)
@Signature("{b9ec819f-b5a5-41c6-b3b3-dd1b3178bcf2}")
@Guid("b9ec819fb5a541c6b3b3dd1b3178bcf2")
@WinRTInterface("b9ec819fb5a541c6b3b3dd1b3178bcf2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILauncherStatics4.ByReference::class)
public interface ILauncherStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun QueryAppUriSupportAsync(uri: Uri?): IAsyncOperation<LaunchQuerySupportStatus?>?

  @InterfaceMethod(1)
  public fun QueryAppUriSupportAsync(uri: Uri?, packageFamilyName: String?):
      IAsyncOperation<LaunchQuerySupportStatus?>?

  @InterfaceMethod(2)
  public fun FindAppUriHandlersAsync(uri: Uri?): IAsyncOperation<IVectorView<AppInfo?>?>?

  @InterfaceMethod(3)
  public fun LaunchUriForUserAsync(user: User?, uri: Uri?): IAsyncOperation<LaunchUriStatus?>?

  @InterfaceMethod(4)
  public fun LaunchUriForUserAsync(
    user: User?,
    uri: Uri?,
    options: LauncherOptions?
  ): IAsyncOperation<LaunchUriStatus?>?

  @InterfaceMethod(5)
  public fun LaunchUriForUserAsync(
    user: User?,
    uri: Uri?,
    options: LauncherOptions?,
    inputData: ValueSet?
  ): IAsyncOperation<LaunchUriStatus?>?

  @InterfaceMethod(6)
  public fun LaunchUriForResultsForUserAsync(
    user: User?,
    uri: Uri?,
    options: LauncherOptions?
  ): IAsyncOperation<LaunchUriResult?>?

  @InterfaceMethod(7)
  public fun LaunchUriForResultsForUserAsync(
    user: User?,
    uri: Uri?,
    options: LauncherOptions?,
    inputData: ValueSet?
  ): IAsyncOperation<LaunchUriResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILauncherStatics4> {
    public override fun getValue() = ABI.makeILauncherStatics4(pointer.getPointer(0))

    public fun setValue(value: ILauncherStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILauncherStatics4 {
    public val __1765591490_Ptr: Pointer?

    public val _1765591490_VtblPtr: Pointer?
      get() = __1765591490_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun QueryAppUriSupportAsync(uri: Uri?):
        IAsyncOperation<LaunchQuerySupportStatus?>? {
      val fnPtr = _1765591490_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LaunchQuerySupportStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1765591490_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LaunchQuerySupportStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun QueryAppUriSupportAsync(uri: Uri?, packageFamilyName: String?):
        IAsyncOperation<LaunchQuerySupportStatus?>? {
      val fnPtr = _1765591490_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LaunchQuerySupportStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1765591490_Ptr, marshalToNative(uri),
          marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LaunchQuerySupportStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindAppUriHandlersAsync(uri: Uri?):
        IAsyncOperation<IVectorView<AppInfo?>?>? {
      val fnPtr = _1765591490_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppInfo?>?>>()
      val hr = fn.invokeHR(arrayOf(__1765591490_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppInfo?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun LaunchUriForUserAsync(user: User?, uri: Uri?):
        IAsyncOperation<LaunchUriStatus?>? {
      val fnPtr = _1765591490_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LaunchUriStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1765591490_Ptr, marshalToNative(user), marshalToNative(uri),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LaunchUriStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun LaunchUriForUserAsync(
      user: User?,
      uri: Uri?,
      options: LauncherOptions?
    ): IAsyncOperation<LaunchUriStatus?>? {
      val fnPtr = _1765591490_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LaunchUriStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1765591490_Ptr, marshalToNative(user), marshalToNative(uri),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LaunchUriStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun LaunchUriForUserAsync(
      user: User?,
      uri: Uri?,
      options: LauncherOptions?,
      inputData: ValueSet?
    ): IAsyncOperation<LaunchUriStatus?>? {
      val fnPtr = _1765591490_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LaunchUriStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1765591490_Ptr, marshalToNative(user), marshalToNative(uri),
          marshalToNative(options), marshalToNative(inputData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LaunchUriStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun LaunchUriForResultsForUserAsync(
      user: User?,
      uri: Uri?,
      options: LauncherOptions?
    ): IAsyncOperation<LaunchUriResult?>? {
      val fnPtr = _1765591490_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LaunchUriResult?>>()
      val hr = fn.invokeHR(arrayOf(__1765591490_Ptr, marshalToNative(user), marshalToNative(uri),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LaunchUriResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun LaunchUriForResultsForUserAsync(
      user: User?,
      uri: Uri?,
      options: LauncherOptions?,
      inputData: ValueSet?
    ): IAsyncOperation<LaunchUriResult?>? {
      val fnPtr = _1765591490_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LaunchUriResult?>>()
      val hr = fn.invokeHR(arrayOf(__1765591490_Ptr, marshalToNative(user), marshalToNative(uri),
          marshalToNative(options), marshalToNative(inputData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LaunchUriResult?>>(result.getValue())
      return resultValue
    }
  }

  public class ILauncherStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1765591490_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILauncherStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9ec819fb5a541c6b3b3dd1b3178bcf2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILauncherStatics4(ptr: Pointer?): WithDefault = ILauncherStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILauncherStatics4 {
      val address = segment.toRawLongValue()
      return makeILauncherStatics4(Pointer(address))
    }

    public override fun toNative(obj: ILauncherStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1765591490_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILauncherStatics4): Array<ILauncherStatics4?> = (elements
        as Array<ILauncherStatics4?>).castToImpl<ILauncherStatics4,ILauncherStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILauncherStatics4?> =
        arrayOfNulls<ILauncherStatics4_Impl>(size) as Array<ILauncherStatics4?>
  }
}
