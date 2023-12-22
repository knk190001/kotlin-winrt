package Windows.Media.Protection.PlayReady

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Media.Protection.PlayReady.IPlayReadyStatics4.ABI.IID
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

@ABIMarker(IPlayReadyStatics5.ABI::class)
@Signature("{230a7075-dfa0-4f8e-a779-cefea9c6824b}")
@Guid("230a7075dfa04f8ea779cefea9c6824b")
@WinRTInterface("230a7075dfa04f8ea779cefea9c6824b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyStatics5.ByReference::class)
public interface IPlayReadyStatics5 : NativeMapped, IWinRTInterface, IPlayReadyStatics4,
    IPlayReadyStatics3, IPlayReadyStatics2, IPlayReadyStatics {
  @InterfaceMethod(0)
  public fun get_HardwareDRMDisabledAtTime(): IReference<DateTime?>?

  @InterfaceMethod(1)
  public fun get_HardwareDRMDisabledUntilTime(): IReference<DateTime?>?

  @InterfaceMethod(2)
  public fun ResetHardwareDRMDisabled(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyStatics5> {
    public override fun getValue() = ABI.makeIPlayReadyStatics5(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyStatics5, IPlayReadyStatics4.WithDefault,
      IPlayReadyStatics3.WithDefault, IPlayReadyStatics2.WithDefault, IPlayReadyStatics.WithDefault
      {
    public val __574261829_Ptr: Pointer?

    public val _574261829_VtblPtr: Pointer?
      get() = __574261829_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HardwareDRMDisabledAtTime(): IReference<DateTime?>? {
      val fnPtr = _574261829_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__574261829_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HardwareDRMDisabledUntilTime(): IReference<DateTime?>? {
      val fnPtr = _574261829_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__574261829_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ResetHardwareDRMDisabled(): Unit {
      val fnPtr = _574261829_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__574261829_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPlayReadyStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPlayReadyStatics4,
      IPlayReadyStatics3, IPlayReadyStatics2, IPlayReadyStatics {
    public override val __574261828_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_574261829_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __574261827_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IPlayReadyStatics3.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_574261829_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __574261826_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IPlayReadyStatics2.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_574261829_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1505496080_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IPlayReadyStatics.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_574261829_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __574261829_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("230a7075dfa04f8ea779cefea9c6824b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyStatics5(ptr: Pointer?): WithDefault = IPlayReadyStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyStatics5 {
      val address = segment.toRawLongValue()
      return makeIPlayReadyStatics5(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__574261829_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyStatics5): Array<IPlayReadyStatics5?> =
        (elements as
        Array<IPlayReadyStatics5?>).castToImpl<IPlayReadyStatics5,IPlayReadyStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyStatics5?> =
        arrayOfNulls<IPlayReadyStatics5_Impl>(size) as Array<IPlayReadyStatics5?>
  }
}
