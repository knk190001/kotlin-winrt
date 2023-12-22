package Windows.Networking.Sockets

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

@ABIMarker(IStreamSocketControl4.ABI::class)
@Signature("{964e2b3d-ec27-4888-b3ce-c74b418423ad}")
@Guid("964e2b3dec274888b3cec74b418423ad")
@WinRTInterface("964e2b3dec274888b3cec74b418423ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocketControl4.ByReference::class)
public interface IStreamSocketControl4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MinProtectionLevel(): SocketProtectionLevel?

  @InterfaceMethod(1)
  public fun put_MinProtectionLevel(value: SocketProtectionLevel?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamSocketControl4> {
    public override fun getValue() = ABI.makeIStreamSocketControl4(pointer.getPointer(0))

    public fun setValue(value: IStreamSocketControl4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocketControl4 {
    public val __1800417634_Ptr: Pointer?

    public val _1800417634_VtblPtr: Pointer?
      get() = __1800417634_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MinProtectionLevel(): SocketProtectionLevel? {
      val fnPtr = _1800417634_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__1800417634_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_MinProtectionLevel(value: SocketProtectionLevel?): Unit {
      val fnPtr = _1800417634_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1800417634_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStreamSocketControl4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1800417634_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocketControl4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("964e2b3dec274888b3cec74b418423ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocketControl4(ptr: Pointer?): WithDefault =
        IStreamSocketControl4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamSocketControl4 {
      val address = segment.toRawLongValue()
      return makeIStreamSocketControl4(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocketControl4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1800417634_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocketControl4): Array<IStreamSocketControl4?> =
        (elements as
        Array<IStreamSocketControl4?>).castToImpl<IStreamSocketControl4,IStreamSocketControl4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocketControl4?> =
        arrayOfNulls<IStreamSocketControl4_Impl>(size) as Array<IStreamSocketControl4?>
  }
}
