package Windows.Graphics.Printing3D

import Windows.Graphics.Printing3D.IPrinting3DCompositeMaterialGroupFactory.ABI.IID
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

@ABIMarker(Printing3DCompositeMaterialGroup.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3DCompositeMaterialGroup;{8d946a5b-40f1-496d-a5fb-340a5a678e30})")
@WinRTByReference(brClass = Printing3DCompositeMaterialGroup.ByReference::class)
public class Printing3DCompositeMaterialGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3DCompositeMaterialGroup.WithDefault,
    IPrinting3DCompositeMaterialGroup2.WithDefault, IWinRTObject {
  private val __1261533922_Interface: IPrinting3DCompositeMaterialGroup.WithDefault by lazy {
    as_1261533922()
  }


  private val __452845968_Interface: IPrinting3DCompositeMaterialGroup2.WithDefault by lazy {
    as_452845968()
  }


  public override val __1261533922_Ptr: JNAPointer? by lazy {
    __1261533922_Interface.__1261533922_Ptr
  }


  public override val __452845968_Ptr: JNAPointer? by lazy {
    __452845968_Interface.__452845968_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1261533922_Interface, __452845968_Interface)

  public constructor(MaterialGroupId: WinDef.UINT) : this(ABI.activate(MaterialGroupId))

  private fun as_1261533922(): IPrinting3DCompositeMaterialGroup.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DCompositeMaterialGroup.ABI.makeIPrinting3DCompositeMaterialGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DCompositeMaterialGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DCompositeMaterialGroup.ABI.makeIPrinting3DCompositeMaterialGroup(ref.value))
  }

  private fun as_452845968(): IPrinting3DCompositeMaterialGroup2.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DCompositeMaterialGroup2.ABI.makeIPrinting3DCompositeMaterialGroup2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DCompositeMaterialGroup2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DCompositeMaterialGroup2.ABI.makeIPrinting3DCompositeMaterialGroup2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3DCompositeMaterialGroup> {
    public override fun getValue() = Printing3DCompositeMaterialGroup(pointer.getPointer(0))

    public fun setValue(value: Printing3DCompositeMaterialGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3DCompositeMaterialGroup, MemoryAddress> {
    public val IPrinting3DCompositeMaterialGroupFactory_Instance:
        IPrinting3DCompositeMaterialGroupFactory by lazy {
      createIPrinting3DCompositeMaterialGroupFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPrinting3DCompositeMaterialGroupFactory():
        IPrinting3DCompositeMaterialGroupFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3DCompositeMaterialGroup".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPrinting3DCompositeMaterialGroupFactory.ABI.makeIPrinting3DCompositeMaterialGroupFactory(factoryActivatorPtr.value))
    }

    public fun activate(MaterialGroupId: WinDef.UINT): JNAPointer? =
        IPrinting3DCompositeMaterialGroupFactory_Instance.Create(MaterialGroupId)?.pointer

    public override fun fromNative(segment: MemoryAddress): Printing3DCompositeMaterialGroup {
      val address = segment.toRawLongValue()
      return Printing3DCompositeMaterialGroup(Pointer(address))
    }

    public override fun toNative(obj: Printing3DCompositeMaterialGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
