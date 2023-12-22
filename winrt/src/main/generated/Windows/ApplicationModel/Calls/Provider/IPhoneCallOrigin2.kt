package Windows.ApplicationModel.Calls.Provider

import Windows.ApplicationModel.Calls.Provider.IPhoneCallOrigin.ABI.IID
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

@ABIMarker(IPhoneCallOrigin2.ABI::class)
@Signature("{04c7e980-9ac2-4768-b536-b68da4957d02}")
@Guid("04c7e9809ac24768b536b68da4957d02")
@WinRTInterface("04c7e9809ac24768b536b68da4957d02")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallOrigin2.ByReference::class)
public interface IPhoneCallOrigin2 : NativeMapped, IWinRTInterface, IPhoneCallOrigin {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  @InterfaceMethod(1)
  public fun put_DisplayName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallOrigin2> {
    public override fun getValue() = ABI.makeIPhoneCallOrigin2(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallOrigin2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallOrigin2, IPhoneCallOrigin.WithDefault {
    public val __1175756501_Ptr: Pointer?

    public val _1175756501_VtblPtr: Pointer?
      get() = __1175756501_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1175756501_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1175756501_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _1175756501_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1175756501_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPhoneCallOrigin2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPhoneCallOrigin {
    public override val __1700495613_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1175756501_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1175756501_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallOrigin2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("04c7e9809ac24768b536b68da4957d02")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallOrigin2(ptr: Pointer?): WithDefault = IPhoneCallOrigin2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallOrigin2 {
      val address = segment.toRawLongValue()
      return makeIPhoneCallOrigin2(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallOrigin2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1175756501_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallOrigin2): Array<IPhoneCallOrigin2?> = (elements
        as Array<IPhoneCallOrigin2?>).castToImpl<IPhoneCallOrigin2,IPhoneCallOrigin2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallOrigin2?> =
        arrayOfNulls<IPhoneCallOrigin2_Impl>(size) as Array<IPhoneCallOrigin2?>
  }
}
