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

@ABIMarker(ILocationTrigger.ABI::class)
@Signature("{47666a1c-6877-481e-8026-ff7e14a811a0}")
@Guid("47666a1c6877481e8026ff7e14a811a0")
@WinRTInterface("47666a1c6877481e8026ff7e14a811a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILocationTrigger.ByReference::class)
public interface ILocationTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger {
  @InterfaceMethod(0)
  public fun get_TriggerType(): LocationTriggerType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILocationTrigger> {
    public override fun getValue() = ABI.makeILocationTrigger(pointer.getPointer(0))

    public fun setValue(value: ILocationTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILocationTrigger, IBackgroundTrigger.WithDefault {
    public val __1004249650_Ptr: Pointer?

    public val _1004249650_VtblPtr: Pointer?
      get() = __1004249650_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TriggerType(): LocationTriggerType? {
      val fnPtr = _1004249650_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LocationTriggerType>()
      val hr = fn.invokeHR(arrayOf(__1004249650_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LocationTriggerType>(result.getValue())
      return resultValue
    }
  }

  public class ILocationTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1004249650_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1004249650_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILocationTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("47666a1c6877481e8026ff7e14a811a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILocationTrigger(ptr: Pointer?): WithDefault = ILocationTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILocationTrigger {
      val address = segment.toRawLongValue()
      return makeILocationTrigger(Pointer(address))
    }

    public override fun toNative(obj: ILocationTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1004249650_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILocationTrigger): Array<ILocationTrigger?> = (elements as
        Array<ILocationTrigger?>).castToImpl<ILocationTrigger,ILocationTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILocationTrigger?> =
        arrayOfNulls<ILocationTrigger_Impl>(size) as Array<ILocationTrigger?>
  }
}
