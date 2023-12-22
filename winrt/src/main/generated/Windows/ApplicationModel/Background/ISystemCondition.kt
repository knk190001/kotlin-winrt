package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundCondition.ABI.IID
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

@ABIMarker(ISystemCondition.ABI::class)
@Signature("{c15fb476-89c5-420b-abd3-fb3030472128}")
@Guid("c15fb47689c5420babd3fb3030472128")
@WinRTInterface("c15fb47689c5420babd3fb3030472128")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemCondition.ByReference::class)
public interface ISystemCondition : NativeMapped, IWinRTInterface, IBackgroundCondition {
  @InterfaceMethod(0)
  public fun get_ConditionType(): SystemConditionType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemCondition> {
    public override fun getValue() = ABI.makeISystemCondition(pointer.getPointer(0))

    public fun setValue(value: ISystemCondition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemCondition, IBackgroundCondition.WithDefault {
    public val __1229363611_Ptr: Pointer?

    public val _1229363611_VtblPtr: Pointer?
      get() = __1229363611_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConditionType(): SystemConditionType? {
      val fnPtr = _1229363611_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemConditionType>()
      val hr = fn.invokeHR(arrayOf(__1229363611_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemConditionType>(result.getValue())
      return resultValue
    }
  }

  public class ISystemCondition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundCondition {
    public override val __772532740_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1229363611_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1229363611_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemCondition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c15fb47689c5420babd3fb3030472128")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemCondition(ptr: Pointer?): WithDefault = ISystemCondition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemCondition {
      val address = segment.toRawLongValue()
      return makeISystemCondition(Pointer(address))
    }

    public override fun toNative(obj: ISystemCondition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1229363611_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemCondition): Array<ISystemCondition?> = (elements as
        Array<ISystemCondition?>).castToImpl<ISystemCondition,ISystemCondition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemCondition?> =
        arrayOfNulls<ISystemCondition_Impl>(size) as Array<ISystemCondition?>
  }
}
