package Windows.System

import Windows.ApplicationModel.AppInfo
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
import Windows.Storage.StorageFile
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

@ABIMarker(ILauncherStatics2.ABI::class)
@Signature("{59ba2fbb-24cb-4c02-a4c4-8294569d54f1}")
@Guid("59ba2fbb24cb4c02a4c48294569d54f1")
@WinRTInterface("59ba2fbb24cb4c02a4c48294569d54f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILauncherStatics2.ByReference::class)
public interface ILauncherStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LaunchUriForResultsAsync(uri: Uri?, options: LauncherOptions?):
      IAsyncOperation<LaunchUriResult?>?

  @InterfaceMethod(1)
  public fun LaunchUriForResultsAsync(
    uri: Uri?,
    options: LauncherOptions?,
    inputData: ValueSet?
  ): IAsyncOperation<LaunchUriResult?>?

  @InterfaceMethod(2)
  public fun LaunchUriAsync(
    uri: Uri?,
    options: LauncherOptions?,
    inputData: ValueSet?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(3)
  public fun QueryUriSupportAsync(uri: Uri?, launchQuerySupportType: LaunchQuerySupportType?):
      IAsyncOperation<LaunchQuerySupportStatus?>?

  @InterfaceMethod(4)
  public fun QueryUriSupportAsync(
    uri: Uri?,
    launchQuerySupportType: LaunchQuerySupportType?,
    packageFamilyName: String?
  ): IAsyncOperation<LaunchQuerySupportStatus?>?

  @InterfaceMethod(5)
  public fun QueryFileSupportAsync(`file`: StorageFile?):
      IAsyncOperation<LaunchQuerySupportStatus?>?

  @InterfaceMethod(6)
  public fun QueryFileSupportAsync(`file`: StorageFile?, packageFamilyName: String?):
      IAsyncOperation<LaunchQuerySupportStatus?>?

  @InterfaceMethod(7)
  public fun FindUriSchemeHandlersAsync(scheme: String?): IAsyncOperation<IVectorView<AppInfo?>?>?

  @InterfaceMethod(8)
  public fun FindUriSchemeHandlersAsync(scheme: String?,
      launchQuerySupportType: LaunchQuerySupportType?): IAsyncOperation<IVectorView<AppInfo?>?>?

  @InterfaceMethod(9)
  public fun FindFileHandlersAsync(extension: String?): IAsyncOperation<IVectorView<AppInfo?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILauncherStatics2> {
    public override fun getValue() = ABI.makeILauncherStatics2(pointer.getPointer(0))

    public fun setValue(value: ILauncherStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILauncherStatics2 {
    public val __1765591492_Ptr: Pointer?

    public val _1765591492_VtblPtr: Pointer?
      get() = __1765591492_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LaunchUriForResultsAsync(uri: Uri?, options: LauncherOptions?):
        IAsyncOperation<LaunchUriResult?>? {
      val fnPtr = _1765591492_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LaunchUriResult?>>()
      val hr = fn.invokeHR(arrayOf(__1765591492_Ptr, marshalToNative(uri), marshalToNative(options),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LaunchUriResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun LaunchUriForResultsAsync(
      uri: Uri?,
      options: LauncherOptions?,
      inputData: ValueSet?
    ): IAsyncOperation<LaunchUriResult?>? {
      val fnPtr = _1765591492_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LaunchUriResult?>>()
      val hr = fn.invokeHR(arrayOf(__1765591492_Ptr, marshalToNative(uri), marshalToNative(options),
          marshalToNative(inputData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LaunchUriResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun LaunchUriAsync(
      uri: Uri?,
      options: LauncherOptions?,
      inputData: ValueSet?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _1765591492_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1765591492_Ptr, marshalToNative(uri), marshalToNative(options),
          marshalToNative(inputData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun QueryUriSupportAsync(uri: Uri?,
        launchQuerySupportType: LaunchQuerySupportType?):
        IAsyncOperation<LaunchQuerySupportStatus?>? {
      val fnPtr = _1765591492_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LaunchQuerySupportStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1765591492_Ptr, marshalToNative(uri),
          marshalToNative(launchQuerySupportType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LaunchQuerySupportStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun QueryUriSupportAsync(
      uri: Uri?,
      launchQuerySupportType: LaunchQuerySupportType?,
      packageFamilyName: String?
    ): IAsyncOperation<LaunchQuerySupportStatus?>? {
      val fnPtr = _1765591492_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LaunchQuerySupportStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1765591492_Ptr, marshalToNative(uri),
          marshalToNative(launchQuerySupportType), marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LaunchQuerySupportStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun QueryFileSupportAsync(`file`: StorageFile?):
        IAsyncOperation<LaunchQuerySupportStatus?>? {
      val fnPtr = _1765591492_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LaunchQuerySupportStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1765591492_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LaunchQuerySupportStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun QueryFileSupportAsync(`file`: StorageFile?, packageFamilyName: String?):
        IAsyncOperation<LaunchQuerySupportStatus?>? {
      val fnPtr = _1765591492_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LaunchQuerySupportStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1765591492_Ptr, marshalToNative(file),
          marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LaunchQuerySupportStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun FindUriSchemeHandlersAsync(scheme: String?):
        IAsyncOperation<IVectorView<AppInfo?>?>? {
      val fnPtr = _1765591492_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppInfo?>?>>()
      val hr = fn.invokeHR(arrayOf(__1765591492_Ptr, marshalToNative(scheme), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppInfo?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun FindUriSchemeHandlersAsync(scheme: String?,
        launchQuerySupportType: LaunchQuerySupportType?): IAsyncOperation<IVectorView<AppInfo?>?>? {
      val fnPtr = _1765591492_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppInfo?>?>>()
      val hr = fn.invokeHR(arrayOf(__1765591492_Ptr, marshalToNative(scheme),
          marshalToNative(launchQuerySupportType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppInfo?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun FindFileHandlersAsync(extension: String?):
        IAsyncOperation<IVectorView<AppInfo?>?>? {
      val fnPtr = _1765591492_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppInfo?>?>>()
      val hr = fn.invokeHR(arrayOf(__1765591492_Ptr, marshalToNative(extension), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppInfo?>?>>(result.getValue())
      return resultValue
    }
  }

  public class ILauncherStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1765591492_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILauncherStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59ba2fbb24cb4c02a4c48294569d54f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILauncherStatics2(ptr: Pointer?): WithDefault = ILauncherStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILauncherStatics2 {
      val address = segment.toRawLongValue()
      return makeILauncherStatics2(Pointer(address))
    }

    public override fun toNative(obj: ILauncherStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1765591492_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILauncherStatics2): Array<ILauncherStatics2?> = (elements
        as Array<ILauncherStatics2?>).castToImpl<ILauncherStatics2,ILauncherStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILauncherStatics2?> =
        arrayOfNulls<ILauncherStatics2_Impl>(size) as Array<ILauncherStatics2?>
  }
}
