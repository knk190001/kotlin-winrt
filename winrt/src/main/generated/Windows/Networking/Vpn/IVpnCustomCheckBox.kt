package Windows.Networking.Vpn

import Windows.Networking.Vpn.IVpnCustomPrompt.ABI.IID
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

@ABIMarker(IVpnCustomCheckBox.ABI::class)
@Signature("{43878753-03c5-4e61-93d7-a957714c4282}")
@Guid("4387875303c54e6193d7a957714c4282")
@WinRTInterface("4387875303c54e6193d7a957714c4282")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnCustomCheckBox.ByReference::class)
public interface IVpnCustomCheckBox : NativeMapped, IWinRTInterface, IVpnCustomPrompt {
  @InterfaceMethod(0)
  public fun put_InitialCheckState(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_InitialCheckState(): Boolean

  @InterfaceMethod(2)
  public fun get_Checked(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnCustomCheckBox> {
    public override fun getValue() = ABI.makeIVpnCustomCheckBox(pointer.getPointer(0))

    public fun setValue(value: IVpnCustomCheckBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnCustomCheckBox, IVpnCustomPrompt.WithDefault {
    public val __767366564_Ptr: Pointer?

    public val _767366564_VtblPtr: Pointer?
      get() = __767366564_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_InitialCheckState(value: Boolean): Unit {
      val fnPtr = _767366564_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__767366564_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_InitialCheckState(): Boolean {
      val fnPtr = _767366564_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__767366564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Checked(): Boolean {
      val fnPtr = _767366564_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__767366564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IVpnCustomCheckBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVpnCustomPrompt {
    public override val __235034533_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_767366564_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __767366564_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnCustomCheckBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4387875303c54e6193d7a957714c4282")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnCustomCheckBox(ptr: Pointer?): WithDefault = IVpnCustomCheckBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnCustomCheckBox {
      val address = segment.toRawLongValue()
      return makeIVpnCustomCheckBox(Pointer(address))
    }

    public override fun toNative(obj: IVpnCustomCheckBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__767366564_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnCustomCheckBox): Array<IVpnCustomCheckBox?> =
        (elements as
        Array<IVpnCustomCheckBox?>).castToImpl<IVpnCustomCheckBox,IVpnCustomCheckBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnCustomCheckBox?> =
        arrayOfNulls<IVpnCustomCheckBox_Impl>(size) as Array<IVpnCustomCheckBox?>
  }
}
