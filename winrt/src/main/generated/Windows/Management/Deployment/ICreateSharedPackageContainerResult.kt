package Windows.Management.Deployment

import Windows.Foundation.HResult
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

@ABIMarker(ICreateSharedPackageContainerResult.ABI::class)
@Signature("{ce8810bf-151c-5707-b936-497e564afc7a}")
@Guid("ce8810bf151c5707b936497e564afc7a")
@WinRTInterface("ce8810bf151c5707b936497e564afc7a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICreateSharedPackageContainerResult.ByReference::class)
public interface ICreateSharedPackageContainerResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Container(): SharedPackageContainer?

  @InterfaceMethod(1)
  public fun get_Status(): SharedPackageContainerOperationStatus?

  @InterfaceMethod(2)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICreateSharedPackageContainerResult> {
    public override fun getValue() =
        ABI.makeICreateSharedPackageContainerResult(pointer.getPointer(0))

    public fun setValue(value: ICreateSharedPackageContainerResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICreateSharedPackageContainerResult {
    public val __2123668291_Ptr: Pointer?

    public val _2123668291_VtblPtr: Pointer?
      get() = __2123668291_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Container(): SharedPackageContainer? {
      val fnPtr = _2123668291_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SharedPackageContainer>()
      val hr = fn.invokeHR(arrayOf(__2123668291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SharedPackageContainer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): SharedPackageContainerOperationStatus? {
      val fnPtr = _2123668291_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SharedPackageContainerOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__2123668291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SharedPackageContainerOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _2123668291_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__2123668291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class ICreateSharedPackageContainerResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2123668291_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICreateSharedPackageContainerResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce8810bf151c5707b936497e564afc7a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICreateSharedPackageContainerResult(ptr: Pointer?): WithDefault =
        ICreateSharedPackageContainerResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICreateSharedPackageContainerResult {
      val address = segment.toRawLongValue()
      return makeICreateSharedPackageContainerResult(Pointer(address))
    }

    public override fun toNative(obj: ICreateSharedPackageContainerResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2123668291_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICreateSharedPackageContainerResult):
        Array<ICreateSharedPackageContainerResult?> = (elements as
        Array<ICreateSharedPackageContainerResult?>).castToImpl<ICreateSharedPackageContainerResult,ICreateSharedPackageContainerResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICreateSharedPackageContainerResult?> =
        arrayOfNulls<ICreateSharedPackageContainerResult_Impl>(size) as
        Array<ICreateSharedPackageContainerResult?>
  }
}
