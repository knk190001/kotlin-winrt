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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILaunchActivatedEventArgs.ABI::class)
@Signature("{fbc93e26-a14a-4b4f-82b0-33bed920af52}")
@Guid("fbc93e26a14a4b4f82b033bed920af52")
@WinRTInterface("fbc93e26a14a4b4f82b033bed920af52")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILaunchActivatedEventArgs.ByReference::class)
public interface ILaunchActivatedEventArgs : NativeMapped, IWinRTInterface, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Arguments(): String?

  @InterfaceMethod(1)
  public fun get_TileId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILaunchActivatedEventArgs> {
    public override fun getValue() = ABI.makeILaunchActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILaunchActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILaunchActivatedEventArgs, IActivatedEventArgs.WithDefault {
    public val __183308062_Ptr: Pointer?

    public val _183308062_VtblPtr: Pointer?
      get() = __183308062_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Arguments(): String? {
      val fnPtr = _183308062_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__183308062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TileId(): String? {
      val fnPtr = _183308062_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__183308062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ILaunchActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_183308062_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __183308062_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILaunchActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbc93e26a14a4b4f82b033bed920af52")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILaunchActivatedEventArgs(ptr: Pointer?): WithDefault =
        ILaunchActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILaunchActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeILaunchActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILaunchActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__183308062_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILaunchActivatedEventArgs):
        Array<ILaunchActivatedEventArgs?> = (elements as
        Array<ILaunchActivatedEventArgs?>).castToImpl<ILaunchActivatedEventArgs,ILaunchActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILaunchActivatedEventArgs?> =
        arrayOfNulls<ILaunchActivatedEventArgs_Impl>(size) as Array<ILaunchActivatedEventArgs?>
  }
}
