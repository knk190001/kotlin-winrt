package Windows.Networking.Sockets

import Windows.Networking.Sockets.IWebSocketControl.ABI.IID
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

@ABIMarker(IStreamWebSocketControl.ABI::class)
@Signature("{b4f478b1-a45a-48db-953a-645b7d964c07}")
@Guid("b4f478b1a45a48db953a645b7d964c07")
@WinRTInterface("b4f478b1a45a48db953a645b7d964c07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamWebSocketControl.ByReference::class)
public interface IStreamWebSocketControl : NativeMapped, IWinRTInterface, IWebSocketControl {
  @InterfaceMethod(0)
  public fun get_NoDelay(): Boolean

  @InterfaceMethod(1)
  public fun put_NoDelay(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamWebSocketControl> {
    public override fun getValue() = ABI.makeIStreamWebSocketControl(pointer.getPointer(0))

    public fun setValue(value: IStreamWebSocketControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamWebSocketControl, IWebSocketControl.WithDefault {
    public val __1305221170_Ptr: Pointer?

    public val _1305221170_VtblPtr: Pointer?
      get() = __1305221170_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NoDelay(): Boolean {
      val fnPtr = _1305221170_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1305221170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_NoDelay(value: Boolean): Unit {
      val fnPtr = _1305221170_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1305221170_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStreamWebSocketControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebSocketControl {
    public override val __136954322_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1305221170_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1305221170_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamWebSocketControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4f478b1a45a48db953a645b7d964c07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamWebSocketControl(ptr: Pointer?): WithDefault =
        IStreamWebSocketControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamWebSocketControl {
      val address = segment.toRawLongValue()
      return makeIStreamWebSocketControl(Pointer(address))
    }

    public override fun toNative(obj: IStreamWebSocketControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1305221170_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamWebSocketControl): Array<IStreamWebSocketControl?>
        = (elements as
        Array<IStreamWebSocketControl?>).castToImpl<IStreamWebSocketControl,IStreamWebSocketControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamWebSocketControl?> =
        arrayOfNulls<IStreamWebSocketControl_Impl>(size) as Array<IStreamWebSocketControl?>
  }
}
