package Windows.Devices.SmartCards

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IReference
import Windows.Storage.Streams.IBuffer
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardEmulatorApduReceivedEventArgs2.ABI::class)
@Signature("{8bf93df0-22e1-4238-8610-94ce4a965425}")
@Guid("8bf93df022e14238861094ce4a965425")
@WinRTInterface("8bf93df022e14238861094ce4a965425")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardEmulatorApduReceivedEventArgs2.ByReference::class)
public interface ISmartCardEmulatorApduReceivedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): WinDef.UINT

  @InterfaceMethod(1)
  public fun TryRespondAsync(responseApdu: IBuffer?, nextState: IReference<WinDef.UINT>?):
      IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardEmulatorApduReceivedEventArgs2> {
    public override fun getValue() =
        ABI.makeISmartCardEmulatorApduReceivedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ISmartCardEmulatorApduReceivedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardEmulatorApduReceivedEventArgs2 {
    public val __149501591_Ptr: Pointer?

    public val _149501591_VtblPtr: Pointer?
      get() = __149501591_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): WinDef.UINT {
      val fnPtr = _149501591_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__149501591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TryRespondAsync(responseApdu: IBuffer?,
        nextState: IReference<WinDef.UINT>?): IAsyncOperation<Boolean>? {
      val fnPtr = _149501591_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__149501591_Ptr, marshalToNative(responseApdu),
          marshalToNative(nextState), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardEmulatorApduReceivedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __149501591_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardEmulatorApduReceivedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8bf93df022e14238861094ce4a965425")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardEmulatorApduReceivedEventArgs2(ptr: Pointer?): WithDefault =
        ISmartCardEmulatorApduReceivedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISmartCardEmulatorApduReceivedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeISmartCardEmulatorApduReceivedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardEmulatorApduReceivedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__149501591_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardEmulatorApduReceivedEventArgs2):
        Array<ISmartCardEmulatorApduReceivedEventArgs2?> = (elements as
        Array<ISmartCardEmulatorApduReceivedEventArgs2?>).castToImpl<ISmartCardEmulatorApduReceivedEventArgs2,ISmartCardEmulatorApduReceivedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardEmulatorApduReceivedEventArgs2?> =
        arrayOfNulls<ISmartCardEmulatorApduReceivedEventArgs2_Impl>(size) as
        Array<ISmartCardEmulatorApduReceivedEventArgs2?>
  }
}
