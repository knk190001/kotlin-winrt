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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStreamSocketControl.ABI::class)
@Signature("{fe25adf1-92ab-4af3-9992-0f4c85e36cc4}")
@Guid("fe25adf192ab4af399920f4c85e36cc4")
@WinRTInterface("fe25adf192ab4af399920f4c85e36cc4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocketControl.ByReference::class)
public interface IStreamSocketControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NoDelay(): Boolean

  @InterfaceMethod(1)
  public fun put_NoDelay(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_KeepAlive(): Boolean

  @InterfaceMethod(3)
  public fun put_KeepAlive(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_OutboundBufferSizeInBytes(): WinDef.UINT

  @InterfaceMethod(5)
  public fun put_OutboundBufferSizeInBytes(value: WinDef.UINT): Unit

  @InterfaceMethod(6)
  public fun get_QualityOfService(): SocketQualityOfService?

  @InterfaceMethod(7)
  public fun put_QualityOfService(value: SocketQualityOfService?): Unit

  @InterfaceMethod(8)
  public fun get_OutboundUnicastHopLimit(): Byte

  @InterfaceMethod(9)
  public fun put_OutboundUnicastHopLimit(value: Byte): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamSocketControl> {
    public override fun getValue() = ABI.makeIStreamSocketControl(pointer.getPointer(0))

    public fun setValue(value: IStreamSocketControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocketControl {
    public val __496111342_Ptr: Pointer?

    public val _496111342_VtblPtr: Pointer?
      get() = __496111342_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NoDelay(): Boolean {
      val fnPtr = _496111342_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__496111342_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_NoDelay(value: Boolean): Unit {
      val fnPtr = _496111342_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__496111342_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_KeepAlive(): Boolean {
      val fnPtr = _496111342_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__496111342_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_KeepAlive(value: Boolean): Unit {
      val fnPtr = _496111342_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__496111342_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_OutboundBufferSizeInBytes(): WinDef.UINT {
      val fnPtr = _496111342_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__496111342_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_OutboundBufferSizeInBytes(value: WinDef.UINT): Unit {
      val fnPtr = _496111342_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__496111342_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_QualityOfService(): SocketQualityOfService? {
      val fnPtr = _496111342_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketQualityOfService>()
      val hr = fn.invokeHR(arrayOf(__496111342_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketQualityOfService>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_QualityOfService(value: SocketQualityOfService?): Unit {
      val fnPtr = _496111342_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__496111342_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_OutboundUnicastHopLimit(): Byte {
      val fnPtr = _496111342_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__496111342_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_OutboundUnicastHopLimit(value: Byte): Unit {
      val fnPtr = _496111342_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__496111342_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStreamSocketControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __496111342_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocketControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe25adf192ab4af399920f4c85e36cc4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocketControl(ptr: Pointer?): WithDefault = IStreamSocketControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamSocketControl {
      val address = segment.toRawLongValue()
      return makeIStreamSocketControl(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocketControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__496111342_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocketControl): Array<IStreamSocketControl?> =
        (elements as
        Array<IStreamSocketControl?>).castToImpl<IStreamSocketControl,IStreamSocketControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocketControl?> =
        arrayOfNulls<IStreamSocketControl_Impl>(size) as Array<IStreamSocketControl?>
  }
}
