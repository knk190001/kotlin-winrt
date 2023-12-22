package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMaintenanceTrigger.ABI::class)
@Signature("{68184c83-fc22-4ce5-841a-7239a9810047}")
@Guid("68184c83fc224ce5841a7239a9810047")
@WinRTInterface("68184c83fc224ce5841a7239a9810047")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMaintenanceTrigger.ByReference::class)
public interface IMaintenanceTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger {
  @InterfaceMethod(0)
  public fun get_FreshnessTime(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_OneShot(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMaintenanceTrigger> {
    public override fun getValue() = ABI.makeIMaintenanceTrigger(pointer.getPointer(0))

    public fun setValue(value: IMaintenanceTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMaintenanceTrigger, IBackgroundTrigger.WithDefault {
    public val __1162771158_Ptr: Pointer?

    public val _1162771158_VtblPtr: Pointer?
      get() = __1162771158_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FreshnessTime(): WinDef.UINT {
      val fnPtr = _1162771158_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1162771158_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_OneShot(): Boolean {
      val fnPtr = _1162771158_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1162771158_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMaintenanceTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1162771158_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1162771158_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMaintenanceTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68184c83fc224ce5841a7239a9810047")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMaintenanceTrigger(ptr: Pointer?): WithDefault = IMaintenanceTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMaintenanceTrigger {
      val address = segment.toRawLongValue()
      return makeIMaintenanceTrigger(Pointer(address))
    }

    public override fun toNative(obj: IMaintenanceTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1162771158_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMaintenanceTrigger): Array<IMaintenanceTrigger?> =
        (elements as
        Array<IMaintenanceTrigger?>).castToImpl<IMaintenanceTrigger,IMaintenanceTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMaintenanceTrigger?> =
        arrayOfNulls<IMaintenanceTrigger_Impl>(size) as Array<IMaintenanceTrigger?>
  }
}
