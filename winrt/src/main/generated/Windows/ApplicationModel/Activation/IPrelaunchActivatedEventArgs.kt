package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
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

@ABIMarker(IPrelaunchActivatedEventArgs.ABI::class)
@Signature("{0c44717b-19f7-48d6-b046-cf22826eaa74}")
@Guid("0c44717b19f748d6b046cf22826eaa74")
@WinRTInterface("0c44717b19f748d6b046cf22826eaa74")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrelaunchActivatedEventArgs.ByReference::class)
public interface IPrelaunchActivatedEventArgs : NativeMapped, IWinRTInterface, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_PrelaunchActivated(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrelaunchActivatedEventArgs> {
    public override fun getValue() = ABI.makeIPrelaunchActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrelaunchActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrelaunchActivatedEventArgs, IActivatedEventArgs.WithDefault {
    public val __1820939821_Ptr: Pointer?

    public val _1820939821_VtblPtr: Pointer?
      get() = __1820939821_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrelaunchActivated(): Boolean {
      val fnPtr = _1820939821_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1820939821_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPrelaunchActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1820939821_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1820939821_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrelaunchActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c44717b19f748d6b046cf22826eaa74")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrelaunchActivatedEventArgs(ptr: Pointer?): WithDefault =
        IPrelaunchActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrelaunchActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrelaunchActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrelaunchActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1820939821_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrelaunchActivatedEventArgs):
        Array<IPrelaunchActivatedEventArgs?> = (elements as
        Array<IPrelaunchActivatedEventArgs?>).castToImpl<IPrelaunchActivatedEventArgs,IPrelaunchActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrelaunchActivatedEventArgs?> =
        arrayOfNulls<IPrelaunchActivatedEventArgs_Impl>(size) as
        Array<IPrelaunchActivatedEventArgs?>
  }
}
