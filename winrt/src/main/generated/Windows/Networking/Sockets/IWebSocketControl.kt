package Windows.Networking.Sockets

import Windows.Foundation.Collections.IVector
import Windows.Security.Credentials.PasswordCredential
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IWebSocketControl.ABI::class)
@Signature("{2ec4bdc3-d9a5-455a-9811-de24d45337e9}")
@Guid("2ec4bdc3d9a5455a9811de24d45337e9")
@WinRTInterface("2ec4bdc3d9a5455a9811de24d45337e9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebSocketControl.ByReference::class)
public interface IWebSocketControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OutboundBufferSizeInBytes(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_OutboundBufferSizeInBytes(value: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun get_ServerCredential(): PasswordCredential?

  @InterfaceMethod(3)
  public fun put_ServerCredential(value: PasswordCredential?): Unit

  @InterfaceMethod(4)
  public fun get_ProxyCredential(): PasswordCredential?

  @InterfaceMethod(5)
  public fun put_ProxyCredential(value: PasswordCredential?): Unit

  @InterfaceMethod(6)
  public fun get_SupportedProtocols(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebSocketControl> {
    public override fun getValue() = ABI.makeIWebSocketControl(pointer.getPointer(0))

    public fun setValue(value: IWebSocketControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebSocketControl {
    public val __136954322_Ptr: Pointer?

    public val _136954322_VtblPtr: Pointer?
      get() = __136954322_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OutboundBufferSizeInBytes(): WinDef.UINT {
      val fnPtr = _136954322_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__136954322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_OutboundBufferSizeInBytes(value: WinDef.UINT): Unit {
      val fnPtr = _136954322_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__136954322_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ServerCredential(): PasswordCredential? {
      val fnPtr = _136954322_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__136954322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ServerCredential(value: PasswordCredential?): Unit {
      val fnPtr = _136954322_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__136954322_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ProxyCredential(): PasswordCredential? {
      val fnPtr = _136954322_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__136954322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ProxyCredential(value: PasswordCredential?): Unit {
      val fnPtr = _136954322_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__136954322_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SupportedProtocols(): IVector<String?>? {
      val fnPtr = _136954322_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__136954322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebSocketControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __136954322_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebSocketControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ec4bdc3d9a5455a9811de24d45337e9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebSocketControl(ptr: Pointer?): WithDefault = IWebSocketControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebSocketControl {
      val address = segment.toRawLongValue()
      return makeIWebSocketControl(Pointer(address))
    }

    public override fun toNative(obj: IWebSocketControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__136954322_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebSocketControl): Array<IWebSocketControl?> = (elements
        as Array<IWebSocketControl?>).castToImpl<IWebSocketControl,IWebSocketControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebSocketControl?> =
        arrayOfNulls<IWebSocketControl_Impl>(size) as Array<IWebSocketControl?>
  }
}
