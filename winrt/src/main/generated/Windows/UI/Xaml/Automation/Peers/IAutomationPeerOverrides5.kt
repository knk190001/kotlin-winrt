package Windows.UI.Xaml.Automation.Peers

import Windows.Foundation.Collections.IIterable
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPeerOverrides5.ABI::class)
@Signature("{2c847c85-781e-49f7-9fef-b9e14d014707}")
@Guid("2c847c85781e49f79fefb9e14d014707")
@WinRTInterface("2c847c85781e49f79fefb9e14d014707")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerOverrides5.ByReference::class)
public interface IAutomationPeerOverrides5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsPeripheralCore(): Boolean

  @InterfaceMethod(1)
  public fun IsDataValidForFormCore(): Boolean

  @InterfaceMethod(2)
  public fun GetFullDescriptionCore(): String?

  @InterfaceMethod(3)
  public fun GetDescribedByCore(): IIterable<AutomationPeer?>?

  @InterfaceMethod(4)
  public fun GetFlowsToCore(): IIterable<AutomationPeer?>?

  @InterfaceMethod(5)
  public fun GetFlowsFromCore(): IIterable<AutomationPeer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerOverrides5> {
    public override fun getValue() = ABI.makeIAutomationPeerOverrides5(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerOverrides5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerOverrides5 {
    public val __706645407_Ptr: Pointer?

    public val _706645407_VtblPtr: Pointer?
      get() = __706645407_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsPeripheralCore(): Boolean {
      val fnPtr = _706645407_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__706645407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun IsDataValidForFormCore(): Boolean {
      val fnPtr = _706645407_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__706645407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetFullDescriptionCore(): String? {
      val fnPtr = _706645407_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__706645407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDescribedByCore(): IIterable<AutomationPeer?>? {
      val fnPtr = _706645407_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<AutomationPeer?>>()
      val hr = fn.invokeHR(arrayOf(__706645407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<AutomationPeer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetFlowsToCore(): IIterable<AutomationPeer?>? {
      val fnPtr = _706645407_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<AutomationPeer?>>()
      val hr = fn.invokeHR(arrayOf(__706645407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<AutomationPeer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetFlowsFromCore(): IIterable<AutomationPeer?>? {
      val fnPtr = _706645407_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<AutomationPeer?>>()
      val hr = fn.invokeHR(arrayOf(__706645407_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<AutomationPeer?>>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPeerOverrides5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __706645407_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerOverrides5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c847c85781e49f79fefb9e14d014707")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerOverrides5(ptr: Pointer?): WithDefault =
        IAutomationPeerOverrides5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerOverrides5 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerOverrides5(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerOverrides5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__706645407_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerOverrides5):
        Array<IAutomationPeerOverrides5?> = (elements as
        Array<IAutomationPeerOverrides5?>).castToImpl<IAutomationPeerOverrides5,IAutomationPeerOverrides5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerOverrides5?> =
        arrayOfNulls<IAutomationPeerOverrides5_Impl>(size) as Array<IAutomationPeerOverrides5?>
  }
}
