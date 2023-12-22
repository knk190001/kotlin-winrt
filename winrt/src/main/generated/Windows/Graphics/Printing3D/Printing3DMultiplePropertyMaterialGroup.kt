package Windows.Graphics.Printing3D

import Windows.Graphics.Printing3D.IPrinting3DMultiplePropertyMaterialGroupFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Printing3DMultiplePropertyMaterialGroup.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterialGroup;{f0950519-aeb9-4515-a39b-a088fbbb277c})")
@WinRTByReference(brClass = Printing3DMultiplePropertyMaterialGroup.ByReference::class)
public class Printing3DMultiplePropertyMaterialGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3DMultiplePropertyMaterialGroup.WithDefault, IWinRTObject {
  private val __1349454818_Interface: IPrinting3DMultiplePropertyMaterialGroup.WithDefault by lazy {
    as_1349454818()
  }


  public override val __1349454818_Ptr: JNAPointer? by lazy {
    __1349454818_Interface.__1349454818_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1349454818_Interface)

  public constructor(MaterialGroupId: WinDef.UINT) : this(ABI.activate(MaterialGroupId))

  private fun as_1349454818(): IPrinting3DMultiplePropertyMaterialGroup.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DMultiplePropertyMaterialGroup.ABI.makeIPrinting3DMultiplePropertyMaterialGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DMultiplePropertyMaterialGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DMultiplePropertyMaterialGroup.ABI.makeIPrinting3DMultiplePropertyMaterialGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3DMultiplePropertyMaterialGroup> {
    public override fun getValue() = Printing3DMultiplePropertyMaterialGroup(pointer.getPointer(0))

    public fun setValue(value: Printing3DMultiplePropertyMaterialGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3DMultiplePropertyMaterialGroup, MemoryAddress> {
    public val IPrinting3DMultiplePropertyMaterialGroupFactory_Instance:
        IPrinting3DMultiplePropertyMaterialGroupFactory by lazy {
      createIPrinting3DMultiplePropertyMaterialGroupFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPrinting3DMultiplePropertyMaterialGroupFactory():
        IPrinting3DMultiplePropertyMaterialGroupFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterialGroup".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPrinting3DMultiplePropertyMaterialGroupFactory.ABI.makeIPrinting3DMultiplePropertyMaterialGroupFactory(factoryActivatorPtr.value))
    }

    public fun activate(MaterialGroupId: WinDef.UINT): JNAPointer? =
        IPrinting3DMultiplePropertyMaterialGroupFactory_Instance.Create(MaterialGroupId)?.pointer

    public override fun fromNative(segment: MemoryAddress):
        Printing3DMultiplePropertyMaterialGroup {
      val address = segment.toRawLongValue()
      return Printing3DMultiplePropertyMaterialGroup(Pointer(address))
    }

    public override fun toNative(obj: Printing3DMultiplePropertyMaterialGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
