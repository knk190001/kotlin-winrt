package Windows.UI.Composition.Scenes

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(ISceneNode.ABI::class)
@Signature("{acf2c247-f307-4581-9c41-af2e29c3b016}")
@Guid("acf2c247f30745819c41af2e29c3b016")
@WinRTInterface("acf2c247f30745819c41af2e29c3b016")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneNode.ByReference::class)
public interface ISceneNode : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Children(): SceneNodeCollection?

  @InterfaceMethod(1)
  public fun get_Components(): SceneComponentCollection?

  @InterfaceMethod(2)
  public fun get_Parent(): SceneNode?

  @InterfaceMethod(3)
  public fun get_Transform(): SceneModelTransform?

  @InterfaceMethod(4)
  public fun FindFirstComponentOfType(value: SceneComponentType?): SceneComponent?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISceneNode> {
    public override fun getValue() = ABI.makeISceneNode(pointer.getPointer(0))

    public fun setValue(value: ISceneNode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneNode {
    public val __1299284833_Ptr: Pointer?

    public val _1299284833_VtblPtr: Pointer?
      get() = __1299284833_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Children(): SceneNodeCollection? {
      val fnPtr = _1299284833_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneNodeCollection>()
      val hr = fn.invokeHR(arrayOf(__1299284833_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneNodeCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Components(): SceneComponentCollection? {
      val fnPtr = _1299284833_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneComponentCollection>()
      val hr = fn.invokeHR(arrayOf(__1299284833_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneComponentCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Parent(): SceneNode? {
      val fnPtr = _1299284833_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneNode>()
      val hr = fn.invokeHR(arrayOf(__1299284833_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Transform(): SceneModelTransform? {
      val fnPtr = _1299284833_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneModelTransform>()
      val hr = fn.invokeHR(arrayOf(__1299284833_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneModelTransform>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FindFirstComponentOfType(value: SceneComponentType?): SceneComponent? {
      val fnPtr = _1299284833_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneComponent>()
      val hr = fn.invokeHR(arrayOf(__1299284833_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneComponent>(result.getValue())
      return resultValue
    }
  }

  public class ISceneNode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1299284833_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneNode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("acf2c247f30745819c41af2e29c3b016")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneNode(ptr: Pointer?): WithDefault = ISceneNode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneNode {
      val address = segment.toRawLongValue()
      return makeISceneNode(Pointer(address))
    }

    public override fun toNative(obj: ISceneNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1299284833_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneNode): Array<ISceneNode?> = (elements as
        Array<ISceneNode?>).castToImpl<ISceneNode,ISceneNode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneNode?> = arrayOfNulls<ISceneNode_Impl>(size)
        as Array<ISceneNode?>
  }
}
