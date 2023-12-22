package Windows.System.RemoteSystems

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

@ABIMarker(IRemoteSystem3.ABI::class)
@Signature("{72b4b495-b7c6-40be-831b-73562f12ffa8}")
@Guid("72b4b495b7c640be831b73562f12ffa8")
@WinRTInterface("72b4b495b7c640be831b73562f12ffa8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystem3.ByReference::class)
public interface IRemoteSystem3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ManufacturerDisplayName(): String?

  @InterfaceMethod(1)
  public fun get_ModelDisplayName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRemoteSystem3>
      {
    public override fun getValue() = ABI.makeIRemoteSystem3(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystem3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystem3 {
    public val __675573663_Ptr: Pointer?

    public val _675573663_VtblPtr: Pointer?
      get() = __675573663_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ManufacturerDisplayName(): String? {
      val fnPtr = _675573663_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__675573663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ModelDisplayName(): String? {
      val fnPtr = _675573663_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__675573663_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystem3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __675573663_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystem3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72b4b495b7c640be831b73562f12ffa8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystem3(ptr: Pointer?): WithDefault = IRemoteSystem3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystem3 {
      val address = segment.toRawLongValue()
      return makeIRemoteSystem3(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystem3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__675573663_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystem3): Array<IRemoteSystem3?> = (elements as
        Array<IRemoteSystem3?>).castToImpl<IRemoteSystem3,IRemoteSystem3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystem3?> =
        arrayOfNulls<IRemoteSystem3_Impl>(size) as Array<IRemoteSystem3?>
  }
}
