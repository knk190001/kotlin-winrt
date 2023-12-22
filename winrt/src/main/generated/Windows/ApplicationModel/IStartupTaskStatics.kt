package Windows.ApplicationModel

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IStartupTaskStatics.ABI::class)
@Signature("{ee5b60bd-a148-41a7-b26e-e8b88a1e62f8}")
@Guid("ee5b60bda14841a7b26ee8b88a1e62f8")
@WinRTInterface("ee5b60bda14841a7b26ee8b88a1e62f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStartupTaskStatics.ByReference::class)
public interface IStartupTaskStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentPackageAsync(): IAsyncOperation<IVectorView<StartupTask?>?>?

  @InterfaceMethod(1)
  public fun GetAsync(taskId: String?): IAsyncOperation<StartupTask?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStartupTaskStatics> {
    public override fun getValue() = ABI.makeIStartupTaskStatics(pointer.getPointer(0))

    public fun setValue(value: IStartupTaskStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStartupTaskStatics {
    public val __1386116456_Ptr: Pointer?

    public val _1386116456_VtblPtr: Pointer?
      get() = __1386116456_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentPackageAsync(): IAsyncOperation<IVectorView<StartupTask?>?>? {
      val fnPtr = _1386116456_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StartupTask?>?>>()
      val hr = fn.invokeHR(arrayOf(__1386116456_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StartupTask?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAsync(taskId: String?): IAsyncOperation<StartupTask?>? {
      val fnPtr = _1386116456_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StartupTask?>>()
      val hr = fn.invokeHR(arrayOf(__1386116456_Ptr, marshalToNative(taskId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StartupTask?>>(result.getValue())
      return resultValue
    }
  }

  public class IStartupTaskStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1386116456_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStartupTaskStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee5b60bda14841a7b26ee8b88a1e62f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStartupTaskStatics(ptr: Pointer?): WithDefault = IStartupTaskStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStartupTaskStatics {
      val address = segment.toRawLongValue()
      return makeIStartupTaskStatics(Pointer(address))
    }

    public override fun toNative(obj: IStartupTaskStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1386116456_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStartupTaskStatics): Array<IStartupTaskStatics?> =
        (elements as
        Array<IStartupTaskStatics?>).castToImpl<IStartupTaskStatics,IStartupTaskStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStartupTaskStatics?> =
        arrayOfNulls<IStartupTaskStatics_Impl>(size) as Array<IStartupTaskStatics?>
  }
}
