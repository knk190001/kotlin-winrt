package Windows.Devices.Bluetooth.Rfcomm

import Windows.Devices.Bluetooth.Rfcomm.IRfcommServiceProvider.ABI.IID
import Windows.Networking.Sockets.StreamSocketListener
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRfcommServiceProvider2.ABI::class)
@Signature("{736bdfc6-3c81-4d1e-baf2-ddbb81284512}")
@Guid("736bdfc63c814d1ebaf2ddbb81284512")
@WinRTInterface("736bdfc63c814d1ebaf2ddbb81284512")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRfcommServiceProvider2.ByReference::class)
public interface IRfcommServiceProvider2 : NativeMapped, IWinRTInterface, IRfcommServiceProvider {
  @InterfaceMethod(0)
  public fun StartAdvertising(listener: StreamSocketListener?, radioDiscoverable: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRfcommServiceProvider2> {
    public override fun getValue() = ABI.makeIRfcommServiceProvider2(pointer.getPointer(0))

    public fun setValue(value: IRfcommServiceProvider2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRfcommServiceProvider2, IRfcommServiceProvider.WithDefault {
    public val __935538617_Ptr: Pointer?

    public val _935538617_VtblPtr: Pointer?
      get() = __935538617_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartAdvertising(listener: StreamSocketListener?,
        radioDiscoverable: Boolean): Unit {
      val fnPtr = _935538617_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__935538617_Ptr, marshalToNative(listener), radioDiscoverable,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRfcommServiceProvider2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IRfcommServiceProvider {
    public override val __1692746649_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_935538617_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __935538617_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRfcommServiceProvider2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("736bdfc63c814d1ebaf2ddbb81284512")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRfcommServiceProvider2(ptr: Pointer?): WithDefault =
        IRfcommServiceProvider2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRfcommServiceProvider2 {
      val address = segment.toRawLongValue()
      return makeIRfcommServiceProvider2(Pointer(address))
    }

    public override fun toNative(obj: IRfcommServiceProvider2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__935538617_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRfcommServiceProvider2): Array<IRfcommServiceProvider2?>
        = (elements as
        Array<IRfcommServiceProvider2?>).castToImpl<IRfcommServiceProvider2,IRfcommServiceProvider2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRfcommServiceProvider2?> =
        arrayOfNulls<IRfcommServiceProvider2_Impl>(size) as Array<IRfcommServiceProvider2?>
  }
}
