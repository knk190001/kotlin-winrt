package Windows.Networking.Vpn

import Windows.Networking.Vpn.IVpnCustomPrompt.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnCustomErrorBox.ABI::class)
@Signature("{9ec4efb2-c942-42af-b223-588b48328721}")
@Guid("9ec4efb2c94242afb223588b48328721")
@WinRTInterface("9ec4efb2c94242afb223588b48328721")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnCustomErrorBox.ByReference::class)
public interface IVpnCustomErrorBox : NativeMapped, IWinRTInterface, IVpnCustomPrompt {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnCustomErrorBox> {
    public override fun getValue() = ABI.makeIVpnCustomErrorBox(pointer.getPointer(0))

    public fun setValue(value: IVpnCustomErrorBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnCustomErrorBox, IVpnCustomPrompt.WithDefault {
    public val __626591908_Ptr: Pointer?

    public val _626591908_VtblPtr: Pointer?
      get() = __626591908_Ptr?.getPointer(0)
  }

  public class IVpnCustomErrorBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVpnCustomPrompt {
    public override val __235034533_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_626591908_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __626591908_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnCustomErrorBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9ec4efb2c94242afb223588b48328721")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnCustomErrorBox(ptr: Pointer?): WithDefault = IVpnCustomErrorBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnCustomErrorBox {
      val address = segment.toRawLongValue()
      return makeIVpnCustomErrorBox(Pointer(address))
    }

    public override fun toNative(obj: IVpnCustomErrorBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__626591908_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnCustomErrorBox): Array<IVpnCustomErrorBox?> =
        (elements as
        Array<IVpnCustomErrorBox?>).castToImpl<IVpnCustomErrorBox,IVpnCustomErrorBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnCustomErrorBox?> =
        arrayOfNulls<IVpnCustomErrorBox_Impl>(size) as Array<IVpnCustomErrorBox?>
  }
}
