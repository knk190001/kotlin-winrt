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

@ABIMarker(IDeleteSharedPackageContainerResult.ABI::class)
@Signature("{35398884-5736-517b-85bc-e598c81ab284}")
@Guid("353988845736517b85bce598c81ab284")
@WinRTInterface("353988845736517b85bce598c81ab284")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeleteSharedPackageContainerResult.ByReference::class)
public interface IDeleteSharedPackageContainerResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): SharedPackageContainerOperationStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeleteSharedPackageContainerResult> {
    public override fun getValue() =
        ABI.makeIDeleteSharedPackageContainerResult(pointer.getPointer(0))

    public fun setValue(value: IDeleteSharedPackageContainerResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeleteSharedPackageContainerResult {
    public val __1737194732_Ptr: Pointer?

    public val _1737194732_VtblPtr: Pointer?
      get() = __1737194732_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): SharedPackageContainerOperationStatus? {
      val fnPtr = _1737194732_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SharedPackageContainerOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1737194732_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SharedPackageContainerOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1737194732_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1737194732_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IDeleteSharedPackageContainerResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1737194732_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeleteSharedPackageContainerResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("353988845736517b85bce598c81ab284")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeleteSharedPackageContainerResult(ptr: Pointer?): WithDefault =
        IDeleteSharedPackageContainerResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeleteSharedPackageContainerResult {
      val address = segment.toRawLongValue()
      return makeIDeleteSharedPackageContainerResult(Pointer(address))
    }

    public override fun toNative(obj: IDeleteSharedPackageContainerResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1737194732_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeleteSharedPackageContainerResult):
        Array<IDeleteSharedPackageContainerResult?> = (elements as
        Array<IDeleteSharedPackageContainerResult?>).castToImpl<IDeleteSharedPackageContainerResult,IDeleteSharedPackageContainerResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeleteSharedPackageContainerResult?> =
        arrayOfNulls<IDeleteSharedPackageContainerResult_Impl>(size) as
        Array<IDeleteSharedPackageContainerResult?>
  }
}
