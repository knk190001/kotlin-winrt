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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnCustomTextBox.ABI::class)
@Signature("{daa4c3ca-8f23-4d36-91f1-76d937827942}")
@Guid("daa4c3ca8f234d3691f176d937827942")
@WinRTInterface("daa4c3ca8f234d3691f176d937827942")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnCustomTextBox.ByReference::class)
public interface IVpnCustomTextBox : NativeMapped, IWinRTInterface, IVpnCustomPrompt {
  @InterfaceMethod(0)
  public fun put_DisplayText(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_DisplayText(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnCustomTextBox> {
    public override fun getValue() = ABI.makeIVpnCustomTextBox(pointer.getPointer(0))

    public fun setValue(value: IVpnCustomTextBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnCustomTextBox, IVpnCustomPrompt.WithDefault {
    public val __1882447677_Ptr: Pointer?

    public val _1882447677_VtblPtr: Pointer?
      get() = __1882447677_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_DisplayText(value: String?): Unit {
      val fnPtr = _1882447677_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1882447677_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_DisplayText(): String? {
      val fnPtr = _1882447677_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1882447677_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IVpnCustomTextBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVpnCustomPrompt {
    public override val __235034533_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1882447677_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1882447677_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnCustomTextBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("daa4c3ca8f234d3691f176d937827942")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnCustomTextBox(ptr: Pointer?): WithDefault = IVpnCustomTextBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnCustomTextBox {
      val address = segment.toRawLongValue()
      return makeIVpnCustomTextBox(Pointer(address))
    }

    public override fun toNative(obj: IVpnCustomTextBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1882447677_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnCustomTextBox): Array<IVpnCustomTextBox?> = (elements
        as Array<IVpnCustomTextBox?>).castToImpl<IVpnCustomTextBox,IVpnCustomTextBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnCustomTextBox?> =
        arrayOfNulls<IVpnCustomTextBox_Impl>(size) as Array<IVpnCustomTextBox?>
  }
}
