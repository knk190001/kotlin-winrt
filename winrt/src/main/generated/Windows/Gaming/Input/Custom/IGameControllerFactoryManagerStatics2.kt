package Windows.Gaming.Input.Custom

import Windows.Gaming.Input.Custom.IGameControllerFactoryManagerStatics.ABI.IID
import Windows.Gaming.Input.IGameController
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

@ABIMarker(IGameControllerFactoryManagerStatics2.ABI::class)
@Signature("{eace5644-19df-4115-b32a-2793e2aea3bb}")
@Guid("eace564419df4115b32a2793e2aea3bb")
@WinRTInterface("eace564419df4115b32a2793e2aea3bb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameControllerFactoryManagerStatics2.ByReference::class)
public interface IGameControllerFactoryManagerStatics2 : NativeMapped, IWinRTInterface,
    IGameControllerFactoryManagerStatics {
  @InterfaceMethod(0)
  public fun TryGetFactoryControllerFromGameController(factory: ICustomGameControllerFactory?,
      gameController: IGameController?): IGameController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameControllerFactoryManagerStatics2> {
    public override fun getValue() =
        ABI.makeIGameControllerFactoryManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IGameControllerFactoryManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameControllerFactoryManagerStatics2,
      IGameControllerFactoryManagerStatics.WithDefault {
    public val __986424258_Ptr: Pointer?

    public val _986424258_VtblPtr: Pointer?
      get() = __986424258_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun TryGetFactoryControllerFromGameController(factory: ICustomGameControllerFactory?,
        gameController: IGameController?): IGameController? {
      val fnPtr = _986424258_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IGameController>()
      val hr = fn.invokeHR(arrayOf(__986424258_Ptr, marshalToNative(factory),
          marshalToNative(gameController), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IGameController>(result.getValue())
      return resultValue
    }
  }

  public class IGameControllerFactoryManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IGameControllerFactoryManagerStatics {
    public override val __1140198796_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_986424258_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __986424258_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameControllerFactoryManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eace564419df4115b32a2793e2aea3bb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameControllerFactoryManagerStatics2(ptr: Pointer?): WithDefault =
        IGameControllerFactoryManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameControllerFactoryManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIGameControllerFactoryManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IGameControllerFactoryManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__986424258_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameControllerFactoryManagerStatics2):
        Array<IGameControllerFactoryManagerStatics2?> = (elements as
        Array<IGameControllerFactoryManagerStatics2?>).castToImpl<IGameControllerFactoryManagerStatics2,IGameControllerFactoryManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameControllerFactoryManagerStatics2?> =
        arrayOfNulls<IGameControllerFactoryManagerStatics2_Impl>(size) as
        Array<IGameControllerFactoryManagerStatics2?>
  }
}
