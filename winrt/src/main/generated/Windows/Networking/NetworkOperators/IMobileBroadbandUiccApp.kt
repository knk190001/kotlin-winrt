package Windows.Networking.NetworkOperators

import Windows.Foundation.Collections.IIterable
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMobileBroadbandUiccApp.ABI::class)
@Signature("{4d170556-98a1-43dd-b2ec-50c90cf248df}")
@Guid("4d17055698a143ddb2ec50c90cf248df")
@WinRTInterface("4d17055698a143ddb2ec50c90cf248df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandUiccApp.ByReference::class)
public interface IMobileBroadbandUiccApp : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): IBuffer?

  @InterfaceMethod(1)
  public fun get_Kind(): UiccAppKind?

  @InterfaceMethod(2)
  public fun GetRecordDetailsAsync(uiccFilePath: IIterable<WinDef.UINT>?):
      IAsyncOperation<MobileBroadbandUiccAppRecordDetailsResult?>?

  @InterfaceMethod(3)
  public fun ReadRecordAsync(uiccFilePath: IIterable<WinDef.UINT>?, recordIndex: Int):
      IAsyncOperation<MobileBroadbandUiccAppReadRecordResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandUiccApp> {
    public override fun getValue() = ABI.makeIMobileBroadbandUiccApp(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandUiccApp_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandUiccApp {
    public val __2129628719_Ptr: Pointer?

    public val _2129628719_VtblPtr: Pointer?
      get() = __2129628719_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): IBuffer? {
      val fnPtr = _2129628719_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__2129628719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Kind(): UiccAppKind? {
      val fnPtr = _2129628719_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UiccAppKind>()
      val hr = fn.invokeHR(arrayOf(__2129628719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UiccAppKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetRecordDetailsAsync(uiccFilePath: IIterable<WinDef.UINT>?):
        IAsyncOperation<MobileBroadbandUiccAppRecordDetailsResult?>? {
      val fnPtr = _2129628719_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<MobileBroadbandUiccAppRecordDetailsResult?>>()
      val hr = fn.invokeHR(arrayOf(__2129628719_Ptr, marshalToNative(uiccFilePath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MobileBroadbandUiccAppRecordDetailsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReadRecordAsync(uiccFilePath: IIterable<WinDef.UINT>?, recordIndex: Int):
        IAsyncOperation<MobileBroadbandUiccAppReadRecordResult?>? {
      val fnPtr = _2129628719_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MobileBroadbandUiccAppReadRecordResult?>>()
      val hr = fn.invokeHR(arrayOf(__2129628719_Ptr, marshalToNative(uiccFilePath), recordIndex,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MobileBroadbandUiccAppReadRecordResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandUiccApp_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2129628719_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandUiccApp, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d17055698a143ddb2ec50c90cf248df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandUiccApp(ptr: Pointer?): WithDefault =
        IMobileBroadbandUiccApp_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandUiccApp {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandUiccApp(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandUiccApp): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2129628719_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandUiccApp): Array<IMobileBroadbandUiccApp?>
        = (elements as
        Array<IMobileBroadbandUiccApp?>).castToImpl<IMobileBroadbandUiccApp,IMobileBroadbandUiccApp_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandUiccApp?> =
        arrayOfNulls<IMobileBroadbandUiccApp_Impl>(size) as Array<IMobileBroadbandUiccApp?>
  }
}
