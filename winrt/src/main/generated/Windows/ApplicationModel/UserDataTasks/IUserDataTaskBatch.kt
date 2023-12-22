package Windows.ApplicationModel.UserDataTasks

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserDataTaskBatch.ABI::class)
@Signature("{382da5fe-20b5-431c-8f42-a5d292ec930c}")
@Guid("382da5fe20b5431c8f42a5d292ec930c")
@WinRTInterface("382da5fe20b5431c8f42a5d292ec930c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskBatch.ByReference::class)
public interface IUserDataTaskBatch : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Tasks(): IVectorView<UserDataTask?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskBatch> {
    public override fun getValue() = ABI.makeIUserDataTaskBatch(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskBatch_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskBatch {
    public val __942471430_Ptr: Pointer?

    public val _942471430_VtblPtr: Pointer?
      get() = __942471430_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Tasks(): IVectorView<UserDataTask?>? {
      val fnPtr = _942471430_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UserDataTask?>>()
      val hr = fn.invokeHR(arrayOf(__942471430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<UserDataTask?>>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskBatch_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __942471430_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskBatch, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("382da5fe20b5431c8f42a5d292ec930c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskBatch(ptr: Pointer?): WithDefault = IUserDataTaskBatch_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTaskBatch {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskBatch(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskBatch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__942471430_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskBatch): Array<IUserDataTaskBatch?> =
        (elements as
        Array<IUserDataTaskBatch?>).castToImpl<IUserDataTaskBatch,IUserDataTaskBatch_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskBatch?> =
        arrayOfNulls<IUserDataTaskBatch_Impl>(size) as Array<IUserDataTaskBatch?>
  }
}
