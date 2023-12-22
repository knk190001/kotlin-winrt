package Windows.System.RemoteSystems

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteSystem6.ABI::class)
@Signature("{d4cda942-c027-533e-9384-3a19b4f7eef3}")
@Guid("d4cda942c027533e93843a19b4f7eef3")
@WinRTInterface("d4cda942c027533e93843a19b4f7eef3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystem6.ByReference::class)
public interface IRemoteSystem6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRemoteSystem6>
      {
    public override fun getValue() = ABI.makeIRemoteSystem6(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystem6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystem6 {
    public val __675573666_Ptr: Pointer?

    public val _675573666_VtblPtr: Pointer?
      get() = __675573666_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _675573666_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__675573666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystem6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __675573666_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystem6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4cda942c027533e93843a19b4f7eef3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystem6(ptr: Pointer?): WithDefault = IRemoteSystem6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystem6 {
      val address = segment.toRawLongValue()
      return makeIRemoteSystem6(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystem6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__675573666_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystem6): Array<IRemoteSystem6?> = (elements as
        Array<IRemoteSystem6?>).castToImpl<IRemoteSystem6,IRemoteSystem6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystem6?> =
        arrayOfNulls<IRemoteSystem6_Impl>(size) as Array<IRemoteSystem6?>
  }
}
