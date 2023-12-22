package Windows.Gaming.XboxLive.Storage

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.System.User
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
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGameSaveProvider.ABI::class)
@Signature("{90a60394-80fe-4211-97f8-a5de14dd95d2}")
@Guid("90a6039480fe421197f8a5de14dd95d2")
@WinRTInterface("90a6039480fe421197f8a5de14dd95d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameSaveProvider.ByReference::class)
public interface IGameSaveProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  @InterfaceMethod(1)
  public fun CreateContainer(name: String?): GameSaveContainer?

  @InterfaceMethod(2)
  public fun DeleteContainerAsync(name: String?): IAsyncOperation<GameSaveOperationResult?>?

  @InterfaceMethod(3)
  public fun CreateContainerInfoQuery(): GameSaveContainerInfoQuery?

  @InterfaceMethod(4)
  public fun CreateContainerInfoQuery(containerNamePrefix: String?): GameSaveContainerInfoQuery?

  @InterfaceMethod(5)
  public fun GetRemainingBytesInQuotaAsync(): IAsyncOperation<Long>?

  @InterfaceMethod(6)
  public fun get_ContainersChangedSinceLastSync(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameSaveProvider> {
    public override fun getValue() = ABI.makeIGameSaveProvider(pointer.getPointer(0))

    public fun setValue(value: IGameSaveProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameSaveProvider {
    public val __1921999721_Ptr: Pointer?

    public val _1921999721_VtblPtr: Pointer?
      get() = __1921999721_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _1921999721_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1921999721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateContainer(name: String?): GameSaveContainer? {
      val fnPtr = _1921999721_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameSaveContainer>()
      val hr = fn.invokeHR(arrayOf(__1921999721_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameSaveContainer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun DeleteContainerAsync(name: String?):
        IAsyncOperation<GameSaveOperationResult?>? {
      val fnPtr = _1921999721_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GameSaveOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1921999721_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GameSaveOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateContainerInfoQuery(): GameSaveContainerInfoQuery? {
      val fnPtr = _1921999721_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameSaveContainerInfoQuery>()
      val hr = fn.invokeHR(arrayOf(__1921999721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameSaveContainerInfoQuery>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateContainerInfoQuery(containerNamePrefix: String?):
        GameSaveContainerInfoQuery? {
      val fnPtr = _1921999721_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameSaveContainerInfoQuery>()
      val hr = fn.invokeHR(arrayOf(__1921999721_Ptr, marshalToNative(containerNamePrefix), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameSaveContainerInfoQuery>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetRemainingBytesInQuotaAsync(): IAsyncOperation<Long>? {
      val fnPtr = _1921999721_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Long>>()
      val hr = fn.invokeHR(arrayOf(__1921999721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Long>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ContainersChangedSinceLastSync(): IVectorView<String?>? {
      val fnPtr = _1921999721_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1921999721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IGameSaveProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1921999721_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameSaveProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90a6039480fe421197f8a5de14dd95d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameSaveProvider(ptr: Pointer?): WithDefault = IGameSaveProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameSaveProvider {
      val address = segment.toRawLongValue()
      return makeIGameSaveProvider(Pointer(address))
    }

    public override fun toNative(obj: IGameSaveProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1921999721_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameSaveProvider): Array<IGameSaveProvider?> = (elements
        as Array<IGameSaveProvider?>).castToImpl<IGameSaveProvider,IGameSaveProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameSaveProvider?> =
        arrayOfNulls<IGameSaveProvider_Impl>(size) as Array<IGameSaveProvider?>
  }
}
