package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.ILaunchActivatedEventArgs.ABI.IID
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

@ABIMarker(ILaunchActivatedEventArgs2.ABI::class)
@Signature("{0fd37ebc-9dc9-46b5-9ace-bd95d4565345}")
@Guid("0fd37ebc9dc946b59acebd95d4565345")
@WinRTInterface("0fd37ebc9dc946b59acebd95d4565345")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILaunchActivatedEventArgs2.ByReference::class)
public interface ILaunchActivatedEventArgs2 : NativeMapped, IWinRTInterface,
    ILaunchActivatedEventArgs, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_TileActivatedInfo(): TileActivatedInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILaunchActivatedEventArgs2> {
    public override fun getValue() = ABI.makeILaunchActivatedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ILaunchActivatedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILaunchActivatedEventArgs2, ILaunchActivatedEventArgs.WithDefault,
      IActivatedEventArgs.WithDefault {
    public val __1387582576_Ptr: Pointer?

    public val _1387582576_VtblPtr: Pointer?
      get() = __1387582576_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TileActivatedInfo(): TileActivatedInfo? {
      val fnPtr = _1387582576_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileActivatedInfo>()
      val hr = fn.invokeHR(arrayOf(__1387582576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileActivatedInfo>(result.getValue())
      return resultValue
    }
  }

  public class ILaunchActivatedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ILaunchActivatedEventArgs,
      IActivatedEventArgs {
    public override val __183308062_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1387582576_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IActivatedEventArgs.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1387582576_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1387582576_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILaunchActivatedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0fd37ebc9dc946b59acebd95d4565345")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILaunchActivatedEventArgs2(ptr: Pointer?): WithDefault =
        ILaunchActivatedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILaunchActivatedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeILaunchActivatedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ILaunchActivatedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1387582576_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILaunchActivatedEventArgs2):
        Array<ILaunchActivatedEventArgs2?> = (elements as
        Array<ILaunchActivatedEventArgs2?>).castToImpl<ILaunchActivatedEventArgs2,ILaunchActivatedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILaunchActivatedEventArgs2?> =
        arrayOfNulls<ILaunchActivatedEventArgs2_Impl>(size) as Array<ILaunchActivatedEventArgs2?>
  }
}
