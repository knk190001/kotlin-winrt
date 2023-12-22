package Windows.Networking.Connectivity

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

@ABIMarker(INetworkStateChangeEventDetails2.ABI::class)
@Signature("{d643c0e8-30d3-4f6a-ad47-6a1873ceb3c1}")
@Guid("d643c0e830d34f6aad476a1873ceb3c1")
@WinRTInterface("d643c0e830d34f6aad476a1873ceb3c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkStateChangeEventDetails2.ByReference::class)
public interface INetworkStateChangeEventDetails2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HasNewTetheringOperationalState(): Boolean

  @InterfaceMethod(1)
  public fun get_HasNewTetheringClientCount(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkStateChangeEventDetails2> {
    public override fun getValue() = ABI.makeINetworkStateChangeEventDetails2(pointer.getPointer(0))

    public fun setValue(value: INetworkStateChangeEventDetails2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkStateChangeEventDetails2 {
    public val __2110675828_Ptr: Pointer?

    public val _2110675828_VtblPtr: Pointer?
      get() = __2110675828_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HasNewTetheringOperationalState(): Boolean {
      val fnPtr = _2110675828_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2110675828_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_HasNewTetheringClientCount(): Boolean {
      val fnPtr = _2110675828_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2110675828_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class INetworkStateChangeEventDetails2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2110675828_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkStateChangeEventDetails2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d643c0e830d34f6aad476a1873ceb3c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkStateChangeEventDetails2(ptr: Pointer?): WithDefault =
        INetworkStateChangeEventDetails2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INetworkStateChangeEventDetails2 {
      val address = segment.toRawLongValue()
      return makeINetworkStateChangeEventDetails2(Pointer(address))
    }

    public override fun toNative(obj: INetworkStateChangeEventDetails2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2110675828_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkStateChangeEventDetails2):
        Array<INetworkStateChangeEventDetails2?> = (elements as
        Array<INetworkStateChangeEventDetails2?>).castToImpl<INetworkStateChangeEventDetails2,INetworkStateChangeEventDetails2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkStateChangeEventDetails2?> =
        arrayOfNulls<INetworkStateChangeEventDetails2_Impl>(size) as
        Array<INetworkStateChangeEventDetails2?>
  }
}
