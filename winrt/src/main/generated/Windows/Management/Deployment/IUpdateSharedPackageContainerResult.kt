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

@ABIMarker(IUpdateSharedPackageContainerResult.ABI::class)
@Signature("{aa407df7-c72d-5458-aea3-4645b6a8ee99}")
@Guid("aa407df7c72d5458aea34645b6a8ee99")
@WinRTInterface("aa407df7c72d5458aea34645b6a8ee99")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUpdateSharedPackageContainerResult.ByReference::class)
public interface IUpdateSharedPackageContainerResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): SharedPackageContainerOperationStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUpdateSharedPackageContainerResult> {
    public override fun getValue() =
        ABI.makeIUpdateSharedPackageContainerResult(pointer.getPointer(0))

    public fun setValue(value: IUpdateSharedPackageContainerResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUpdateSharedPackageContainerResult {
    public val __1237808906_Ptr: Pointer?

    public val _1237808906_VtblPtr: Pointer?
      get() = __1237808906_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): SharedPackageContainerOperationStatus? {
      val fnPtr = _1237808906_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SharedPackageContainerOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1237808906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SharedPackageContainerOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1237808906_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1237808906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IUpdateSharedPackageContainerResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1237808906_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUpdateSharedPackageContainerResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa407df7c72d5458aea34645b6a8ee99")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUpdateSharedPackageContainerResult(ptr: Pointer?): WithDefault =
        IUpdateSharedPackageContainerResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUpdateSharedPackageContainerResult {
      val address = segment.toRawLongValue()
      return makeIUpdateSharedPackageContainerResult(Pointer(address))
    }

    public override fun toNative(obj: IUpdateSharedPackageContainerResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1237808906_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUpdateSharedPackageContainerResult):
        Array<IUpdateSharedPackageContainerResult?> = (elements as
        Array<IUpdateSharedPackageContainerResult?>).castToImpl<IUpdateSharedPackageContainerResult,IUpdateSharedPackageContainerResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUpdateSharedPackageContainerResult?> =
        arrayOfNulls<IUpdateSharedPackageContainerResult_Impl>(size) as
        Array<IUpdateSharedPackageContainerResult?>
  }
}
