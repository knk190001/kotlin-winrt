package Windows.Management.Deployment

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDeploymentResult2.ABI::class)
@Signature("{fc0e715c-5a01-4bd7-bcf1-381c8c82e04a}")
@Guid("fc0e715c5a014bd7bcf1381c8c82e04a")
@WinRTInterface("fc0e715c5a014bd7bcf1381c8c82e04a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeploymentResult2.ByReference::class)
public interface IDeploymentResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsRegistered(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeploymentResult2> {
    public override fun getValue() = ABI.makeIDeploymentResult2(pointer.getPointer(0))

    public fun setValue(value: IDeploymentResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeploymentResult2 {
    public val __1623679148_Ptr: Pointer?

    public val _1623679148_VtblPtr: Pointer?
      get() = __1623679148_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsRegistered(): Boolean {
      val fnPtr = _1623679148_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1623679148_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDeploymentResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1623679148_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeploymentResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fc0e715c5a014bd7bcf1381c8c82e04a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeploymentResult2(ptr: Pointer?): WithDefault = IDeploymentResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeploymentResult2 {
      val address = segment.toRawLongValue()
      return makeIDeploymentResult2(Pointer(address))
    }

    public override fun toNative(obj: IDeploymentResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1623679148_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeploymentResult2): Array<IDeploymentResult2?> =
        (elements as
        Array<IDeploymentResult2?>).castToImpl<IDeploymentResult2,IDeploymentResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeploymentResult2?> =
        arrayOfNulls<IDeploymentResult2_Impl>(size) as Array<IDeploymentResult2?>
  }
}
