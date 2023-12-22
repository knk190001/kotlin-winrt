package Windows.ApplicationModel.Background

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundExecutionManagerStatics.ABI::class)
@Signature("{e826ea58-66a9-4d41-83d4-b4c18c87b846}")
@Guid("e826ea5866a94d4183d4b4c18c87b846")
@WinRTInterface("e826ea5866a94d4183d4b4c18c87b846")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundExecutionManagerStatics.ByReference::class)
public interface IBackgroundExecutionManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAccessAsync(): IAsyncOperation<BackgroundAccessStatus?>?

  @InterfaceMethod(1)
  public fun RequestAccessAsync(applicationId: String?): IAsyncOperation<BackgroundAccessStatus?>?

  @InterfaceMethod(2)
  public fun RemoveAccess(): Unit

  @InterfaceMethod(3)
  public fun RemoveAccess(applicationId: String?): Unit

  @InterfaceMethod(4)
  public fun GetAccessStatus(): BackgroundAccessStatus?

  @InterfaceMethod(5)
  public fun GetAccessStatus(applicationId: String?): BackgroundAccessStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundExecutionManagerStatics> {
    public override fun getValue() =
        ABI.makeIBackgroundExecutionManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IBackgroundExecutionManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundExecutionManagerStatics {
    public val __1778881457_Ptr: Pointer?

    public val _1778881457_VtblPtr: Pointer?
      get() = __1778881457_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAccessAsync(): IAsyncOperation<BackgroundAccessStatus?>? {
      val fnPtr = _1778881457_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BackgroundAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1778881457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<BackgroundAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestAccessAsync(applicationId: String?):
        IAsyncOperation<BackgroundAccessStatus?>? {
      val fnPtr = _1778881457_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BackgroundAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1778881457_Ptr, marshalToNative(applicationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<BackgroundAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RemoveAccess(): Unit {
      val fnPtr = _1778881457_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1778881457_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun RemoveAccess(applicationId: String?): Unit {
      val fnPtr = _1778881457_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1778881457_Ptr, marshalToNative(applicationId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetAccessStatus(): BackgroundAccessStatus? {
      val fnPtr = _1778881457_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundAccessStatus>()
      val hr = fn.invokeHR(arrayOf(__1778881457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundAccessStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetAccessStatus(applicationId: String?): BackgroundAccessStatus? {
      val fnPtr = _1778881457_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundAccessStatus>()
      val hr = fn.invokeHR(arrayOf(__1778881457_Ptr, marshalToNative(applicationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundAccessStatus>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundExecutionManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1778881457_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundExecutionManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e826ea5866a94d4183d4b4c18c87b846")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundExecutionManagerStatics(ptr: Pointer?): WithDefault =
        IBackgroundExecutionManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundExecutionManagerStatics {
      val address = segment.toRawLongValue()
      return makeIBackgroundExecutionManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundExecutionManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1778881457_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundExecutionManagerStatics):
        Array<IBackgroundExecutionManagerStatics?> = (elements as
        Array<IBackgroundExecutionManagerStatics?>).castToImpl<IBackgroundExecutionManagerStatics,IBackgroundExecutionManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundExecutionManagerStatics?> =
        arrayOfNulls<IBackgroundExecutionManagerStatics_Impl>(size) as
        Array<IBackgroundExecutionManagerStatics?>
  }
}
