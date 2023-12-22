package Windows.Networking.Connectivity

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IConnectionSession.ABI::class)
@Signature("{ff905d4c-f83b-41b0-8a0c-1462d9c56b73}")
@Guid("ff905d4cf83b41b08a0c1462d9c56b73")
@WinRTInterface("ff905d4cf83b41b08a0c1462d9c56b73")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectionSession.ByReference::class)
public interface IConnectionSession : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_ConnectionProfile(): ConnectionProfile?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectionSession> {
    public override fun getValue() = ABI.makeIConnectionSession(pointer.getPointer(0))

    public fun setValue(value: IConnectionSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectionSession, IClosable.WithDefault {
    public val __425461493_Ptr: Pointer?

    public val _425461493_VtblPtr: Pointer?
      get() = __425461493_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConnectionProfile(): ConnectionProfile? {
      val fnPtr = _425461493_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConnectionProfile>()
      val hr = fn.invokeHR(arrayOf(__425461493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConnectionProfile>(result.getValue())
      return resultValue
    }
  }

  public class IConnectionSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_425461493_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __425461493_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectionSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff905d4cf83b41b08a0c1462d9c56b73")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectionSession(ptr: Pointer?): WithDefault = IConnectionSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectionSession {
      val address = segment.toRawLongValue()
      return makeIConnectionSession(Pointer(address))
    }

    public override fun toNative(obj: IConnectionSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__425461493_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectionSession): Array<IConnectionSession?> =
        (elements as
        Array<IConnectionSession?>).castToImpl<IConnectionSession,IConnectionSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectionSession?> =
        arrayOfNulls<IConnectionSession_Impl>(size) as Array<IConnectionSession?>
  }
}
