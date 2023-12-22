package Windows.Devices.Enumeration

import Windows.Devices.Enumeration.IEnclosureLocation.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IEnclosureLocation2.ABI::class)
@Signature("{2885995b-e07d-485d-8a9e-bdf29aef4f66}")
@Guid("2885995be07d485d8a9ebdf29aef4f66")
@WinRTInterface("2885995be07d485d8a9ebdf29aef4f66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEnclosureLocation2.ByReference::class)
public interface IEnclosureLocation2 : NativeMapped, IWinRTInterface, IEnclosureLocation {
  @InterfaceMethod(0)
  public fun get_RotationAngleInDegreesClockwise(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEnclosureLocation2> {
    public override fun getValue() = ABI.makeIEnclosureLocation2(pointer.getPointer(0))

    public fun setValue(value: IEnclosureLocation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEnclosureLocation2, IEnclosureLocation.WithDefault {
    public val __1471391145_Ptr: Pointer?

    public val _1471391145_VtblPtr: Pointer?
      get() = __1471391145_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RotationAngleInDegreesClockwise(): WinDef.UINT {
      val fnPtr = _1471391145_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1471391145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IEnclosureLocation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IEnclosureLocation {
    public override val __186011561_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1471391145_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1471391145_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEnclosureLocation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2885995be07d485d8a9ebdf29aef4f66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEnclosureLocation2(ptr: Pointer?): WithDefault = IEnclosureLocation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEnclosureLocation2 {
      val address = segment.toRawLongValue()
      return makeIEnclosureLocation2(Pointer(address))
    }

    public override fun toNative(obj: IEnclosureLocation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1471391145_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEnclosureLocation2): Array<IEnclosureLocation2?> =
        (elements as
        Array<IEnclosureLocation2?>).castToImpl<IEnclosureLocation2,IEnclosureLocation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEnclosureLocation2?> =
        arrayOfNulls<IEnclosureLocation2_Impl>(size) as Array<IEnclosureLocation2?>
  }
}
